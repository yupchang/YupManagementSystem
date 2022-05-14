import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RacketManager RacketManager = new RacketManager(input);
		
		selectMenu(input, RacketManager);
	}
	
	public static void selectMenu(Scanner input, RacketManager RacketManager ) {
		int num = -1;
		while (num != 5) {
			try {
				ShowMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					RacketManager.AddRacket();
					break;
				case 2:
					RacketManager.DeleteRacket();
					break;
				case 3:
					RacketManager.EditRacket();
					break;
				case 4:
					RacketManager.ViewRackets();
					break;
				default:
					continue;
				} 
			}
			catch(InputMismatchException e) {
				System.out.println("1~5 사이의 숫자를 입력해 주세요.");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void ShowMenu() {
		System.out.println("*** Racket Management System Menu ***");
		System.out.println("1. Add Racket");
		System.out.println("2. Delete Racket");
		System.out.println("3. Edit Racket's info");
		System.out.println("4. View Rackets");
		System.out.println("5. Exit");
		
		System.out.println("원하는 숫자를 입력하세요.");
	}

}
