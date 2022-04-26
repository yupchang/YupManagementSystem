import java.util.Scanner;

public class MenuManager {


	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		RacketManager RacketManager = new RacketManager(input);
		
		while (num != 6) {
			System.out.println("1. Add Racket");
			System.out.println("2. Delete Racket");
			System.out.println("3. Edit Racket's info");
			System.out.println("4. View Rackets");
			System.out.println("5. Exit");
			
			System.out.println("원하는 숫자를 입력하세요.");
			num = input.nextInt();
			
			switch (num) {
			case 1 : //라켓 추가
				RacketManager.AddRacket();
				break;
			
			
			case 2 : //라켓 정보 초기화
				RacketManager.DeleteRacket();
				break;
				
			case 3 : //라켓의 정보 수정
				RacketManager.EditRacket();
				break;
			case 4 : //라켓 정보 보여주기
				RacketManager.ViewRackets();
				break;
			case 5 : //프로그램 끝내기
				break;
			}		
		}
			
	}

}
