package racket;

import java.util.Scanner;

public class Racket {
	protected RacketCompany company = RacketCompany.Yonex;
	protected String name;
	protected int price;
	protected String madeCountry;
	protected int number;
	
	

	public Racket() {
		
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
		System.out.println("Racket : " + name + "\tcompany : " + company + "\tprice : " + price + "\tmadecountry : " + madeCountry + "\tnumber : " + number);
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
