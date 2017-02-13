package graphics;

import graphics.FrevoWindow.HashTableModel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
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
	
	public DetailsFrame(AbstractRepresentation representation) {
		super(representation.getXMLData().getClassName() + " ("
				+ representation.getHash() + ")");
		
		setBounds(0, 0, 100, 100);
		
		this.setLocationRelativeTo(null);
		
		setPreferredSize(new Dimension(260, 200));
		
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
		
		GridLayout detailsLayout = new GridLayout(1, 1);
		detailsPanel.setLayout(detailsLayout);
		detailsPanel.add(detailsScrollPane);
		
		this.add(detailsPanel);
		
		this.pack();
	}
}
