import java.util.Scanner;

public class MenuManager {

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
			
			System.out.println("원하는 숫자를 입려하세요.");
			num = input.nextInt();
			
			switch (num) {
			case 1 : 
				System.out.println("추가할 라켓의 이름을 입력하세요.");
				String racket_name = input.next();
				System.out.println("라켓의 가격을 입력하세요.");
				int racket_price = input.nextInt();
				System.out.println("라켓의 고유번호를 입력하세요");
				int racket_number = input.nextInt();
				
				break;
			
			
			case 2 : //라켓 정보 초기화
				System.out.println("1번은 삭제, 2번은 뒤로가기");
				int a = input.nextInt();
				if (a == 1) {
					racket_name = "";
					racket_price = 0;
					racket_number = 0;
					break;
				}
				else {
					continue;
				}
				
				
			case 3 : //라켓의 정보 수정
				
			case 4 : //라켓 정보 보여주기
			
			case 5 : //메뉴로 돌아가기	
				continue;
			case 6 : //프로그램 끝내기
				break;
			}		
		}
			
	}

}
