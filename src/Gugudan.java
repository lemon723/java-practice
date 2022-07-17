import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("출력할 단은?");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		
		if (number < 2 || number > 9) {
			System.out.println("값을 잘못 입력하셨습니다.");
		}
		else {			
			System.out.println("\n사용자가 입력한 단: " + number + "단");
			System.out.println(number + "단을 출력합니다.\n");
			
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
