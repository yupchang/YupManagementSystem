package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class RacketAdder extends JPanel{
	
	WindowFrame frame;

	public RacketAdder(WindowFrame frame) {
		this.frame = frame;
	
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
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
		
	}
}
