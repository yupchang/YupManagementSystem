import java.util.ArrayList;
import java.util.Scanner;

import racket.ApecsRacket;
import racket.GosenRacket;
import racket.JoobongRacket;
import racket.Racket;
import racket.RacketCompany;
import racket.RacketInput;
import racket.VictorRacket;
import racket.YonexRacket;

public class RacketManager {
	ArrayList<RacketInput> rackets = new ArrayList<RacketInput>();
	Scanner input;
	RacketManager(Scanner input){
		this.input = input;
	}
	public void AddRacket() {
		int kind = 0;
		RacketInput racketinput;
		
		while (kind > 5 || kind < 1) {
			System.out.println("1 : Yoenx");
			System.out.println("2 : Gosen");
			System.out.println("3 : Victor");
			System.out.println("4 : Apecs");
			System.out.println("5 : Joobong");
			System.out.println("Select num for Racket Company between 1 to 5 : ");
			
			kind = input.nextInt();
			if (kind == 1) {
				racketinput = new YonexRacket(RacketCompany.Yonex);
				racketinput.getUserInput(input);
				rackets.add(racketinput);
				break;
			}
			else if (kind == 2) {
				racketinput = new GosenRacket(RacketCompany.Gosen);
				racketinput.getUserInput(input);
				rackets.add(racketinput);
				break;
			}
			else if (kind == 3) {
				racketinput = new VictorRacket(RacketCompany.Victor);
				racketinput.getUserInput(input);
				rackets.add(racketinput);
				break;
			}
			else if (kind == 4) {
				racketinput = new ApecsRacket(RacketCompany.Apecs);
				rackets.add(racketinput);
				break;
			}
			else if (kind == 5) {
				racketinput = new JoobongRacket(RacketCompany.Joobong);
				rackets.add(racketinput);
				break;
			}
			else {
				System.out.println("Select num for Racket Company between 1 to 5 : ");
			}
		}
		
	}
	public void DeleteRacket() {
		System.out.print("Racket's number : ");
		int racket_number = input.nextInt();
		int index = -1;
		for(int i = 0; i<rackets.size(); i++) {
			if (rackets.get(i).getNumber() == racket_number) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			rackets.remove(index);
			System.out.println("the racket" + racket_number + "is deleted." );
		}
		
		else {
			System.out.println("The racket has not been registed.");
			return;
		}
		
	}
	public void EditRacket() {
		System.out.print("Racket's number");
		int racket_number = input.nextInt();
		for(int i = 0; i<rackets.size(); i++) {
			RacketInput racketinput = rackets.get(i);
			if (racketinput.getNumber() == racket_number) {
				int num = -1;
				while(num!= 6) {
					System.out.println("- Racket Info Edit Menu -");
					System.out.println("	1. Edit Number");
					System.out.println("	2. Edit Name");
					System.out.println("	3. Edit price");
					System.out.println("	4. Edit MadeCountry");
					System.out.println("	5. End Edit");
					System.out.println("Select one number between 1 - 6 :");
					num = input.nextInt();
					if (num == 1) {
						System.out.println("racket's number : ");
						int number = input.nextInt();
						racketinput.setNumber(number);
					}
					else if(num == 2) {
						System.out.println("racket's name : ");
						String name = input.next();
						racketinput.setName(name);
					}
					else if(num == 3) {
						System.out.println("racket's price : ");
						int price = input.nextInt();
						racketinput.setPrice(price);
					}
					else if(num == 4) {
						System.out.println("racket's madecountry : ");
						String madeCountry = input.next();
						racketinput.setMadeCountry(madeCountry);
					}
					else {
						continue;
					}//if
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

}
