package racket;

import java.util.Scanner;

public class ApecsRacket extends Racket implements RacketInput{
	
	public ApecsRacket(RacketCompany company) {
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
	public void printInfo() {
		String scompany = "none";
		switch(this.company) {
		case Yonex:
			scompany = "Yonex";
			break;
		case Gosen:
			scompany = "Gosen";
			break;
		case Victor:
			scompany = "Victor";
			break;
		case Apecs:
			scompany = "Apecs";
			break;
		case Joobong:
			scompany = "Joobong";
			break;
		default:
		}
		System.out.println("Racket : " + name + "\tcompany : " + scompany + "\tprice : " + price + "\tmadecountry : " + madeCountry + "\tnumber : " + number);
		
	}
}
