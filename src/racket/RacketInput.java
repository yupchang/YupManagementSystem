package racket;

import java.util.Scanner;

import exception.PriceFormatException;

public interface RacketInput {


	
	public void getUserInput(Scanner input);

	public void setNumber(int number);
	
	public int getNumber();

	public void setName(String name);
	
	public String getName();

	public void setPrice(int price) throws PriceFormatException;
	
	public int getPrice();

	public void setMadeCountry(String madeCountry);
	
	public String getMadeCountry();

	public void printInfo();
	
	public void setRacketNumber(Scanner input);
	
	public void setRacketName(Scanner input);
	
	public void setRacketPrice(Scanner input);
	
	public void setRacketMadeCountry(Scanner input);
	

}
