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
			
			System.out.println("���ϴ� ���ڸ� �Է��ϼ���.");
			num = input.nextInt();
			
			switch (num) {
			case 1 : //���� �߰�
				RacketManager.AddRacket();
				break;
			
			
			case 2 : //���� ���� �ʱ�ȭ
				RacketManager.DeleteRacket();
				break;
				
			case 3 : //������ ���� ����
				RacketManager.EditRacket();
				break;
			case 4 : //���� ���� �����ֱ�
				RacketManager.ViewRackets();
				break;
			case 5 : //���α׷� ������
				break;
			}		
		}
			
	}

}
