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
			
			System.out.println("���ϴ� ���ڸ� �Է��ϼ���.");
			num = input.nextInt();
			
			switch (num) {
			case 1 : 
				System.out.println("�߰��� ������ �̸��� �Է��ϼ���.");
				String racket_name = input.next();
				System.out.println("������ ������ �Է��ϼ���.");
				int racket_price = input.nextInt();
				System.out.println("������ ������ȣ�� �Է��ϼ���");
				int racket_number = input.nextInt();
				
				break;
			
			
			case 2 : //���� ���� �ʱ�ȭ
				System.out.println("1���� ����, 2���� �ڷΰ���");
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
				
				
			case 3 : //������ ���� ����
				
			case 4 : //���� ���� �����ֱ�
			
			case 5 : //�޴��� ���ư���	
				continue;
			case 6 : //���α׷� ������
				break;
			}		
		}
			
	}

}
