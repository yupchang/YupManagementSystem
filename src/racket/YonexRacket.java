package racket;

import java.util.Scanner;

public class YonexRacket extends Racket{
	protected String exportedCountry;
	
	public YonexRacket(RacketCompany company) {
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
		String scompany = getCompanyString();
		System.out.println("number : " + number + "\tRacket : " + name + "\tcompany : " + scompany + "\tprice : " + price + "\tmadecountry : " + madeCountry +"\texportedCountry : " + exportedCountry);		
	}
	
	public String getCompanyString() {
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
		return scompany;
	}
}
