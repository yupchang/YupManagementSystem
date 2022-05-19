import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import racket.ApecsRacket;
import racket.GosenRacket;
import racket.JoobongRacket;
import racket.Racket;
import racket.RacketCompany;
import racket.RacketInput;
import racket.VictorRacket;
import racket.YonexRacket;

public class RacketManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1693044326174703716L;
	 
	ArrayList<RacketInput> rackets = new ArrayList<RacketInput>();
	transient Scanner input;
	RacketManager(Scanner input){
		this.input = input;
	}
	public void AddRacket() {
		int company = 0;
		RacketInput racketinput;
		
		while (company > 5 || company < 1) {
			try {
				System.out.println("1 : Yoenx");
				System.out.println("2 : Gosen");
				System.out.println("3 : Victor");
				System.out.println("4 : Apecs");
				System.out.println("5 : Joobong");
				System.out.println("Select num for Racket Company between 1 to 5 : ");
				
				company = input.nextInt();
				if (company == 1) {
					racketinput = new YonexRacket(RacketCompany.Yonex);
					racketinput.getUserInput(input);
					rackets.add(racketinput);
					break;
				}
				else if (company == 2) {
					racketinput = new GosenRacket(RacketCompany.Gosen);
					racketinput.getUserInput(input);
					rackets.add(racketinput);
					break;
				}
				else if (company == 3) {
					racketinput = new VictorRacket(RacketCompany.Victor);
					racketinput.getUserInput(input);
					rackets.add(racketinput);
					break;
				}
				else if (company == 4) {
					racketinput = new ApecsRacket(RacketCompany.Apecs);
					rackets.add(racketinput);
					break;
				}
				else if (company == 5) {
					racketinput = new JoobongRacket(RacketCompany.Joobong);
					rackets.add(racketinput);
					break;
				}
				else {
					System.out.println("Select num for Racket Company between 1 to 5 : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1~5 사이의 숫자를 입력해 주세요.");
				if(input.hasNext()) {
					input.next();
				}
				company = -1;
			}
		}
		
	}
	public void DeleteRacket() {
		System.out.print("Racket's number : ");
		int racket_number = input.nextInt();
		int index = findIndex(racket_number);
		removefromRackets(index, racket_number);
	}
	public int findIndex(int racket_number) {
		int index = -1;
		for(int i = 0; i<rackets.size(); i++) {
			if (rackets.get(i).getNumber() == racket_number) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int removefromRackets(int index, int racket_number) {
		if (index >= 0) {
			rackets.remove(index);
			System.out.println("the racket" + racket_number + "is deleted." );
			return 1;
		}
		
		else {
			System.out.println("The racket has not been registed.");
			return -1;
		}	
	}
	public void EditRacket() {
		System.out.print("Racket's number");
		int racket_number = input.nextInt();
		for(int i = 0; i<rackets.size(); i++) {
			RacketInput racket = rackets.get(i);
			if (racket.getNumber() == racket_number) {
				int num = -1;
				while(num!= 6) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						racket.setRacketNumber(input);
						break;
					case 2:
						racket.setRacketName(input);
						break;
					case 3:
						racket.setRacketPrice(input);
						break;
					case 4:
						racket.setRacketMadeCountry(input);
						break;
					default:
						continue;	
					}
					
				}//while
				break;
			}//if
		}//for
			
	}
	public void ViewRackets() {
		System.out.println("# of registered rackets:" + rackets.size());
		for(int i = 0; i<rackets.size(); i++) {
				rackets.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("- Racket Info Edit Menu -");
		System.out.println("	1. Edit Number");
		System.out.println("	2. Edit Name");
		System.out.println("	3. Edit price");
		System.out.println("	4. Edit MadeCountry");
		System.out.println("	5. End Edit");
		System.out.println("Select one number between 1 - 6 :");
	}

}
