import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 < 2 || num1 > 9 || num2 < 2 || num2 > 9)
			{
				System.out.println("INPUT ERROR!");
			}

			else if(num1 > num2) {
				for(int i = 1; i <= 9; i++) {
					for(int j = num1; j >= num2; j--) {
						System.out.printf("%d * %d = %2d   ",j,i,j*i);
					}
					System.out.println();
				}
				break;
			}
			else if(num1 <= num2) {
				for(int i = 1; i <= 9; i++) {
					for(int j = num1; j <= num2; j++) {
						System.out.printf("%d * %d = %2d   ",j,i,j*i);
					}
					System.out.println();
				}
				break;
			}

		}

	}
}