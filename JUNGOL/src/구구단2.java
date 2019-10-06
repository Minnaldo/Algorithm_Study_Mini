import java.util.Scanner;

public class 구구단2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %2d   ", num1,i,num1*i);
				if(i % 3 == 0)
					System.out.println();

			}
			System.out.println();
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %2d   ", num2,i,num2*i);
				if(i % 3 == 0)
					System.out.println();
			}
		}
	}

}
