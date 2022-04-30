package racket;

import java.util.Scanner;

public class GosenRacket extends Racket {
	public GosenRacket(RacketCompany company) {
		super(company);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Racket's name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Racket's price : ");
		int price = input.nextInt();
		this.setPrice(price);
		
		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have a madecountry? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("made country : ");
				String madecountry = input.next();
				this.setMadeCountry(madecountry);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMadeCountry("");
				break;
			}
			else {
			}
		}
		
		System.out.print("Racket's number : ");
		int number = input.nextInt();
		this.setNumber(number);
		
	}
}
