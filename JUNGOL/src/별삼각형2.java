import java.util.Scanner;

public class 별삼각형2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		while(true) {
			if(num1 % 2 == 0 || num2 < 1 || num2 > 4) {
				System.out.println("INPUT ERROR!");
				break;
			}
			
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
				break;
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
				break;
			}

			else if(num2 == 3) {

				for(int i = 0; i < num1/2; i++) {
					for(int k = 0; k < i; k++) {
						System.out.print(" ");
					}
					for(int j = i; j < num1-i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

				for(int i = 0; i < num1/2+1; i++) {
					for(int k = i; k < num1/2; k++) {
						System.out.print(" ");
					}
					for(int j = 0; j < 1+2*i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}

			else if(num2 == 4) {
				for(int i = 0; i < num1/2+1; i++) {
					for(int j = 0; j < i; j++) {
						System.out.print(" ");
					}
					for(int k = i; k < num1/2+1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i = 0; i < num1/2; i++) {
					for(int j = 0; j < num1/2; j++) {
						System.out.print(" ");
					}
					for(int j = 0; j <= i+1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}
		}
	}

}
