import java.util.Scanner;

public class 별삼각형1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if(num2 == 1) {
			for(int i = 0; i < num1; i++) {
				for(int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		else if(num2 == 2) {
			for(int i = 0; i < num1; i++) {
				for(int j = i; j < num1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		else if(num2 == 3) {
			for(int i = 0; i < num1; i++) {
				for(int j = i; j < num1-1; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < i+1; k++) {
					System.out.print("*");
				}
				for(int k = 0; k < i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		else
			System.out.println("INPUT ERROR!");
	}

}
