package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Event.RacketAdderCancelListener;
import Event.RacketAdderListener;
import manager.RacketManager;

public class RacketAdder extends JPanel{
	
	WindowFrame frame;
	RacketManager racketmanager;
	
	public RacketAdder(WindowFrame frame, RacketManager RacketManager) {
		this.frame = frame;
		this.racketmanager = RacketManager;
	
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNumber = new JLabel("Number : ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPrice = new JLabel("Price : ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		JLabel labelMadeCountry = new JLabel("MadeCountry : ", JLabel.TRAILING);
		JTextField fieldMadeCountry = new JTextField(10);
		labelMadeCountry.setLabelFor(fieldMadeCountry);
		panel.add(labelMadeCountry);
		panel.add(fieldMadeCountry);
		
		JLabel labelExportCountry = new JLabel("ExportCountry : ", JLabel.TRAILING);
		JTextField fieldExportCountry = new JTextField(10);
		labelExportCountry.setLabelFor(fieldExportCountry);
		panel.add(labelExportCountry);
		panel.add(fieldExportCountry);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new RacketAdderListener(fieldNumber, fieldName, fieldPrice, fieldMadeCountry, fieldExportCountry, racketmanager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new RacketAdderCancelListener(frame));
		
		panel.add(saveButton);
		panel.add(cancelButton);

		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
		
	}
}
