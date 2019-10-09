import java.util.Scanner;

public class 별삼각형3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		while(true) {
			int num1 = sc.nextInt();
			
			if(num1 % 2 == 0 || num1 > 100) {
				System.out.println("INPUT ERROR!");
				break;
			}

			for(int i = 0; i < num1/2; i++) {
				for(int k = 0; k < i; k++) {
					System.out.print(" ");
				}
				for(int j = 0; j < 1+2*i; j++) {
					System.out.print("*");W
				}
				System.out.println();
				
			}
			for(int i = 0; i < num1/2+1; i++) {
				for(int k = i; k <= num1/2-1; k++) {
					System.out.print(" ");
				}
				for(int j = 0; j < num1-2*i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			break;
		}
	}

}
