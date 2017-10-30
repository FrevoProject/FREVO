/*
 * Copyright (C) 2017 Sergii Zhevzhyk
 * Original project page: http://www.frevotool.tk
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License Version 3 as published
 * by the Free Software Foundation http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * There is no warranty for this free software. The GPL requires that 
 * modified versions be marked as changed, so that their problems will
 * not be attributed erroneously to authors of previous versions.
 */
package spiderinoLight;

import java.awt.AWTException;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import utils.ScreenCapture;
import main.FrevoMain;
import net.jodk.lang.FastMath;
import components.simplesoccer.model.SimPlayer;

public class SpiderinoDisplay extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int multipl = 9;
	private static final int width = 120;
	private static final int height = 80;
	public Point center;
	private static final int Relwidth = width * multipl;
	private static int Relheight = height * multipl;
	private final Color bgColor = new Color(20, 210, 10);
	private final Color bgColor2 = new Color(30, 220, 20);
	private final Color spiderinoColor = Color.RED;
	private final double player_virt_size = 1.3; // virtual size of the player, only used
											// for painting not for calculating
	private final double ball_virt_size = 0.7; // virtual size of the ball, only used
											// for painting not for calculating
	private GCanvas canvas;
	private SpiderinoLight master;
	public boolean saving;	
	
	private JPanel menuPanel;
	protected JButton startButton;
	protected JButton stopButton;
	private Icon playIcon;
	private Icon stopIcon;
	protected JCheckBox saveFramesCheckbox;
	
	private DecimalFormat format = new DecimalFormat("##.00");
	
	public SpiderinoDisplay(SpiderinoLight master) // constructor
	{
		super("Skiinet Simulator");
		this.master = master;
		center = new Point((Relwidth / 2) + 10, (Relheight / 2) + 10);
		setBounds(0, 0, Relwidth + 50, Relheight + 140);// set frame
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container con = this.getContentPane(); // inherit main frame
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		// Create Menu frame
		menuPanel = new JPanel();
		//menuPanel.setPreferredSize(new Dimension(300, 50));
		menuPanel.setMinimumSize(new Dimension(300, 50));
		//menuPanel.setMaximumSize(new Dimension(300, 50));
		menuPanel.setBorder(new TitledBorder("Control"));
		menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.X_AXIS));
		
		startButton = new JButton();
		startButton.setSize(30, 25);
		menuPanel.add(startButton);

		stopButton = new JButton();
		stopButton.setSize(30, 25);
		stopButton.setEnabled(false);
		menuPanel.add(stopButton);
		
		saveFramesCheckbox = new JCheckBox("Save frames");
		saveFramesCheckbox.setEnabled(true);
		menuPanel.add(saveFramesCheckbox);

		try {
			playIcon = new ImageIcon(new URL("jar:file:"
					+ FrevoMain.getInstallDirectory()
					+ "/Libraries/jlfgr/jlfgr-1_0.jar/!" + "/"
					+ "toolbarButtonGraphics/media/Play24.gif"));
			stopIcon = new ImageIcon(new URL("jar:file:"
					+ FrevoMain.getInstallDirectory()
					+ "/Libraries/jlfgr/jlfgr-1_0.jar/!" + "/"
					+ "toolbarButtonGraphics/media/Stop24.gif"));
			startButton.setIcon(playIcon);
			stopButton.setIcon(stopIcon);
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		
		setRun(false);
		
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				startButton.setEnabled(false);
				stopButton.setEnabled(true);
				saveFramesCheckbox.setEnabled(false);				
				setRun(true);		
			}
		});

		stopButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				startButton.setEnabled(true);
				stopButton.setEnabled(false);
				saveFramesCheckbox.setEnabled(true);
				setRun(false);
			}
		});
		
		addWindowListener(new WindowAdapter() {  // add listener to speed up
			@Override                            // sim once window is closed
			public void windowClosing(WindowEvent we) {
				setWithPause(false);
				super.windowClosing(we);
			}
		});
		
		con.add(menuPanel);

		canvas = new GCanvas(); // create drawing canvas
		canvas.setBackground(bgColor);
		con.add(canvas); // add to frame
		
		setVisible(true); 
		this.setLocationRelativeTo(null);
	}

	private void setRun(boolean pause) {
		master.runSimulation = pause;
	}

	public void updateDisplay() {
		canvas.repaint();				
	}
	
	private void saveFrame() {
		try {
			ScreenCapture.createImage(canvas, "./Images/Frame_" + String.format("%04d", master.aktStep)  + ".bmp");
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	class GCanvas extends Canvas {
		private static final long serialVersionUID = -8748735749891520153L;
		public Point innerOrigo = new Point(10 + 5 * multipl, 10 + 5 * multipl); // TOP-LEFT
																					// corner
																					// of
																					// inner
																					// rect
		private int innerwidth = Relwidth - (2 * (5 * multipl));
		private int innerheight = Relheight - 2 * (5 * multipl);
		public Point midpoint = new Point(innerOrigo.x + (innerwidth / 2),
				innerOrigo.y + (innerheight / 2)); // center of the field
		public double player_size = player_virt_size * multipl;
		public double ball_size = ball_virt_size * multipl;

		// implements double buffering to avoid flickers
		public void update(Graphics g) {
			Graphics offgc;
			Image offscreen = null;
			Dimension d = getSize();

			// create the offscreen buffer and associated Graphics
			offscreen = createImage(d.width, d.height);
			offgc = offscreen.getGraphics();
			// clear the exposed area
			offgc.setColor(getBackground());
			offgc.fillRect(0, 0, d.width, d.height);
			offgc.setColor(getForeground());
			// do normal redraw
			paint(offgc);
			// transfer offscreen to window
			g.drawImage(offscreen, 0, 0, this);
			
			master.withsave = saveFramesCheckbox.isSelected();
			if (master.withsave) {
				//saveFrame();
				saving = true;
				saveFrame();
				saving = false;
			}
		}

		public void paint(Graphics g) {	
			g.setColor(bgColor2);
			int currentStrip = 10;
			int stripWidth = Relwidth/20;
			for (int i=0; i< 10; i++) {
				g.fillRect( currentStrip, 10, stripWidth, Relheight);
				currentStrip += 2* stripWidth;
			}
			
			// draw field acc.
			g.setColor(Color.WHITE);
			
			// draw players
			for (int i = 0; i < SimpleSoccer.PLAYERS_PER_TEAM; i++) {
				paintPlayer(g, master.playersinteams[0][i]);				
			}

			// draw the step number to lower left corner
			g.setColor(Color.BLACK);
			g.drawString(
					"Time: " + format.format((float)master.aktStep/10), 15, Relheight + 30);
		}

		private void paintPlayer(Graphics g, SimPlayer player) {
			Point correctMid = new Point(midpoint.x + (int) ((player.position.x) * multipl),
					midpoint.y + (int) ((player.position.y) * multipl));
			int a = correctMid.x - (int) (player_size);
			int b = correctMid.y - (int) (player_size);
			Color prev = g.getColor(); // saves actual color
			
			int team = player.side;
			
			
			
			g.setColor(spiderinoColor);
			g.fillOval(a, b, (int) (2 * player_size), (int) (2 * player_size));			
			
			
			g.setColor(Color.GRAY);
			g.drawOval(a, b, (int) (2 * player_size), (int) (2 * player_size));
			
			// draw direction line
			g.setColor(Color.YELLOW);
			double direction = player.getBodyDirection();
			g.drawLine(
						correctMid.x,
						correctMid.y,
						correctMid.x
								+ (int) (player_size * FastMath.sin(
								FastMath.toRadians(direction))),
						correctMid.y
								- (int) (player_size * FastMath.cos(
							FastMath.toRadians(direction))));

			// draw number near player
			g.setColor(spiderinoColor);	
			
			g.setColor(prev); // resets color
		
		}
	}

	public void setWithPause(boolean bool) {
		master.withpause = bool;
	}
}
