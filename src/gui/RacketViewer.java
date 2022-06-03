package gui;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.RacketManager;
import racket.RacketInput;

public class RacketViewer extends JPanel {
	
	WindowFrame frame;

	RacketManager racketmanager;
	
	public RacketViewer(WindowFrame frame, RacketManager RacketManager) {
		this.frame = frame;
		this.racketmanager = RacketManager;
		
		System.out.println("***" + RacketManager.size() + "***");
		
		this.setLayout(new BorderLayout());
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("MadeCountry");
		model.addColumn("ExportCountry");

		for(int i = 0; i<RacketManager.size(); i++) {
			Vector row = new Vector();
			RacketInput RI = RacketManager.get(i);
			row.add(RI.getNumber());
			row.add(RI.getName());
			row.add(RI.getPrice());
			row.add(RI.getMadeCountry());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}		

}
