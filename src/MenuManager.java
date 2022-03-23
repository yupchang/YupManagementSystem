import java.util.Scanner;

public class MenuManager {

	public static void AddRacket() {
		Scanner input = new Scanner(System.in);
		System.out.print("Racket's name");
		String racket_name = input.next();
		System.out.print("Racket's price");
		int racket_price = input.nextInt();
		System.out.print("Racket's company");
		String racket_company = input.next();
	}
	public static void DeleteRacket() {
		Scanner input = new Scanner(System.in);
		System.out.print("Racket's name");
		String racket_name = input.next();
		
	}
	public static void EditRacket() {
		Scanner input = new Scanner(System.in);
		System.out.print("Racket's name");
		String racket_name = input.next();
	}
	public static void ViewRacket() {
		Scanner input = new Scanner(System.in);
		System.out.print("Racket's name");
		String racket_name = input.next();
	}
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		while (num != 6) {
			System.out.println("1. Add Racket");
			System.out.println("2. Delete Racket");
			System.out.println("3. Edit Racket's info");
			System.out.println("4. View Racket");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			
			System.out.println("원하는 숫자를 입력하세요.");
			num = input.nextInt();
			
			switch (num) {
			case 1 : //라켓 추가
				AddRacket();
				
				break;
			
			
			case 2 : //라켓 정보 초기화
				DeleteRacket();
				
				
			case 3 : //라켓의 정보 수정
				EditRacket();
			case 4 : //라켓 정보 보여주기
				ViewRacket();
			case 5 : //메뉴로 돌아가기	
				continue;
			case 6 : //프로그램 끝내기
				break;
			}		
		}
			
	}

}
