package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.RacketManager;

public class WindowFrame extends JFrame{
	
	RacketManager RacketManager;
	MenuSelection menuselection;
	RacketAdder racketadder;
	RacketViewer racketviewer;

	public WindowFrame(RacketManager RacketManager) {

		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.RacketManager = RacketManager;
		menuselection = new MenuSelection(this);
		racketadder = new RacketAdder(this);
		racketviewer = new RacketViewer(this, this.RacketManager);


		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public RacketAdder getRacketadder() {
		return racketadder;
	}

	public void setRacketadder(RacketAdder racketadder) {
		this.racketadder = racketadder;
	}

	public RacketViewer getRacketviewer() {
		return racketviewer;
	}

	public void setRacketviewer(RacketViewer racketviewer) {
		this.racketviewer = racketviewer;
	}
}
