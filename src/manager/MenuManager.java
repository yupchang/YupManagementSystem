package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger Logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		RacketManager RacketManager = getObject("racketmanager.ser");
		if(RacketManager == null) {
			RacketManager = new RacketManager(input);
		}
		
		WindowFrame frame = new WindowFrame(RacketManager);
		selectMenu(input, RacketManager);
		putObject(RacketManager, "racketmanager.ser");
	}
	
	public static void selectMenu(Scanner input, RacketManager RacketManager ) {
		int num = -1;
		while (num != 5) {
			try {
				ShowMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					RacketManager.AddRacket();
					Logger.log("add a racket");
					break;
				case 2:
					RacketManager.DeleteRacket();
					Logger.log("delete a racket");
					break;
				case 3:
					RacketManager.EditRacket();
					Logger.log("edit a racket");
					break;
				case 4:
					RacketManager.ViewRackets();
					Logger.log("view a list of rackets");
					break;
				default:
					continue;
				} 
			}
			catch(InputMismatchException e) {
				System.out.println("1~5 사이의 숫자를 입력해 주세요.");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void ShowMenu() {
		System.out.println("*** Racket Management System Menu ***");
		System.out.println("1. Add Racket");
		System.out.println("2. Delete Racket");
		System.out.println("3. Edit Racket's info");
		System.out.println("4. View Rackets");
		System.out.println("5. Exit");
		
		System.out.println("원하는 숫자를 입력하세요.");
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

	public static void putObject(RacketManager RacketManager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(RacketManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
