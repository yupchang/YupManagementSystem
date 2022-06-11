package Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.RacketViewer;
import gui.WindowFrame;
import manager.RacketManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		RacketViewer racketViewer = frame.getRacketviewer();
		RacketManager RacketManager = getObject("racketmanager.ser");
		racketViewer.setRacketmanager(RacketManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(racketViewer);
		frame.revalidate();
		frame.repaint();
	}

	public static RacketManager getObject(String filename) {
		RacketManager RacketManager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			RacketManager = (RacketManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return RacketManager;	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return RacketManager;
	}
}
