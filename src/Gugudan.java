import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("����� ����?");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		
		if (number < 2 || number > 9) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
		}
		else {			
			System.out.println("\n����ڰ� �Է��� ��: " + number + "��");
			System.out.println(number + "���� ����մϴ�.\n");
			
			if (number == 9) {
				int j = 0;
				while (j < 10) {
					j ++;
					int ans = number * j;
					System.out.printf("%d * %d = %d\n", number, j, ans);
				}
			}
			
			else {
				for(int i = 1; i < 10; i++) {
					int ans = number * i;
					System.out.printf("%d * %d = %d\n", number, i, ans);
				}
			}
		}
	}
}
