import java.util.Scanner;

public class 구구단2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 > num2) {
				for(int i = num1; i >= num2; i--) {
					for(int j = 1; j <= 3; j++) {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
					}
					System.out.println();
					for(int j = 4; j <= 6; j++) {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
					}
					System.out.println();
					for(int j = 7; j <= 9; j++) {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
					}
					
					System.out.println();
					System.out.println();
				}
			}
			else if(num1 <= num2) {
				for(int i = num1; i <= num2; i++) {
					for(int j = 1; j <= 3; j++) {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
					}
					System.out.println();
					for(int j = 4; j <= 6; j++) {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
					}
					System.out.println();
					for(int j = 7; j <= 9; j++) {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
					}
					
					System.out.println();
					System.out.println();
				}
			}
		}
	}

}
