package racket;

import java.util.Scanner;

public class Racket {
	protected RacketCompany company;
	protected String name;
	protected int price;
	protected String madeCountry;
	protected int number;
	
	

	public Racket() {
		
	}
	public Racket(RacketCompany company) {
		this.company = company;
	}
	
	public Racket(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public Racket(String name, int price, String madeCountry, int number) {
		this.name = name;
		this.price = price;
		this.madeCountry = madeCountry;
		this.number = number;
	}
	public Racket(RacketCompany company, String name, int price, String madeCountry, int number) {
		this.company = company;
		this.name = name;
		this.price = price;
		this.madeCountry = madeCountry;
		this.number = number;
	}
	
	
	
	
	
	
	public RacketCompany getCompany() {
		return company;
	}
	public void setCompany(RacketCompany company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMadeCountry() {
		return madeCountry;
	}
	public void setMadeCountry(String madeCountry) {
		this.madeCountry = madeCountry;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Racket's name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Racket's price : ");
		int price = input.nextInt();
		this.setPrice(price);
		
		System.out.print("Racket's madecountry : ");
		String madeCountry = input.next();
		this.setMadeCountry(madeCountry);
		
		System.out.print("Racket's number : ");
		int number = input.nextInt();
		this.setNumber(number);
		
	}
}
