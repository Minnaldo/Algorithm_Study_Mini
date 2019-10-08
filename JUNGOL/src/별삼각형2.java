import java.util.Scanner;

public class 별삼각형2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if(num2 == 1) {
			for(int i = 0; i < num1/2+1; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();	
			}

			for(int i = 0; i < num1/2; i++) {
				for(int j = i; j <= num1/2-1; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
		}
		
		else if(num2 == 2) {
			for(int i = 0; i < num1/2+1; i++) {
				for(int j = i; j < num1/2; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i = 0; i < num1/2; i++) {
				for(int l = 0; l <= i; l++) {
					System.out.print(" ");
				}
				for(int m = i; m <= num1/2-1; m++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		else if(num2 == 3) {
			for(int i = 0; i < num1/2+1; i++) {
				for(int k = 0; k < i; k++) {
					System.out.print(" ");
				}
				for(int j = 0; j < num1-2*i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i = 0; i < num1/2; i++) {
				for(int j = 0; j < num1/2-i-1; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < num1; k++) {
					System.out.print("*");
				}

				System.out.println();
			}
		}
	}

}
