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
			
			System.out.println("���ϴ� ���ڸ� �Է��ϼ���.");
			num = input.nextInt();
			
			switch (num) {
			case 1 : //���� �߰�
				AddRacket();
				
				break;
			
			
			case 2 : //���� ���� �ʱ�ȭ
				DeleteRacket();
				
				
			case 3 : //������ ���� ����
				EditRacket();
			case 4 : //���� ���� �����ֱ�
				ViewRacket();
			case 5 : //�޴��� ���ư���	
				continue;
			case 6 : //���α׷� ������
				break;
			}		
		}
			
	}

}
