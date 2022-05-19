package racket;

import java.io.Serializable;
import java.util.Scanner;

import exception.PriceFormatException;

public abstract class Racket implements RacketInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1117693268421754516L;
	protected RacketCompany company;
	protected String name;
	protected int price;
	protected String madeCountry;
	protected int number;
	protected String exportedCountry;
	
	
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
	public void setPrice(int price) throws PriceFormatException {
		if(price>500000 || price<10000) {
			throw new PriceFormatException();
		}
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
	public void setExport(String exportedCountry) {
		this.exportedCountry = exportedCountry;
	}
	public String getExport() {
		return this.exportedCountry;
	}


	public abstract void printInfo();
	
	public void setRacketNumber(Scanner input) {
		System.out.println("racket's number : ");
		int number = input.nextInt();
		this.setNumber(number);
	}
	
	public void setRacketName(Scanner input) {
		System.out.println("racket's name : ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setRacketPrice(Scanner input) {
		int price = 0;
		while (price>500000 || price<10000) {
			System.out.println("racket's price : ");
			price = input.nextInt();
			try {
				this.setPrice(price);
			} catch (PriceFormatException e) {
				System.out.println("Strange price. Put price between 10000 and 500000");
			}
		}

	}
	
	public void setRacketMadeCountry(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you know where is the madecountry? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("Input racket's madecountry.");
				String a = input.next();
				this.setMadeCountry(a);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMadeCountry("");
				break;
			}
			else {
			}
		}
	}
	public void setRacketExportCountry(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you know which country exported this racket? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("Input racket's exportcountry");
				String a = input.next();
				setExport(a);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setExport("");
				break;
			}
			else {
			}
		}	
	}

}
