package racket;

import java.util.Scanner;

public class JoobongRacket extends Racket{
	public JoobongRacket(RacketCompany company) {
		super(company);
	}
	public void getUserInput(Scanner input) {
		
		setRacketNumber(input);
		
		setRacketName(input);
		
		setRacketPrice(input);

		setRacketMadeCountry(input);
		
		setRacketExportCountry(input);

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
		System.out.println("Racket : " + name + "\tcompany : " + scompany + "\tprice : " + price + "\tmadecountry : " + madeCountry + "\tnumber : " + number + "\texportedCountry : " + exportedCountry);			
	}
}
