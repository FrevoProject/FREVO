package graphics;

import graphics.FrevoWindow.HashTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;

import core.AbstractRepresentation;

/** Displays the details of the given representation */
public class DetailsFrame extends JFrame {

	private static final long serialVersionUID = -2449990889264554319L;
	
	private JPanel detailsPanel;
	private JTable detailsTable;
	private JScrollPane detailsScrollPane;
	private JButton exportButton;
	
	public DetailsFrame(AbstractRepresentation representation) {
		super(representation.getXMLData().getClassName() + " ("
				+ representation.getHash() + ")");
		
		setBounds(0, 0, 100, 300);
		
		exportButton=new JButton("Export representation");
		exportButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			JFrame exportFrame = new ExportFrame(representation);
			exportFrame.setVisible(true);
		  }
		});
		exportButton.setPreferredSize(new Dimension(100, 30));
		this.setLocationRelativeTo(null);
		
		setPreferredSize(new Dimension(500, 500));
		
		detailsPanel = new JPanel();
		detailsPanel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.BLACK, 2), "Details of "
						+ representation.getHash()));
		
		HashTableModel tm = new FrevoWindow.HashTableModel(null);
		tm.setTableModel(representation.getDetails());
		tm.fireTableDataChanged();
		
		detailsTable = new JTable(tm);
		detailsScrollPane = new JScrollPane(detailsTable);
		detailsTable.setTableHeader(null);
		
		// sort jtable based on the first column
		detailsTable.setAutoCreateRowSorter(true);
		RowSorter<?> sorter = detailsTable.getRowSorter();
		List<SortKey> sortKeys = new ArrayList<SortKey>();
		sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
		sorter.setSortKeys(sortKeys);
		
		BorderLayout detailsLayout = new BorderLayout();
		detailsPanel.setLayout(detailsLayout);
		detailsPanel.add(BorderLayout.CENTER,detailsScrollPane);
		detailsPanel.add(BorderLayout.PAGE_END, exportButton);
		this.add(detailsPanel);
		
		this.pack();
	}
}
