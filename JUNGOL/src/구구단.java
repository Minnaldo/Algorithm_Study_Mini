import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1 >= 2 && num1 <= 9 && num2 >= 2 && num2 <= 9) {
				if(num1 > num2) {
					for(int i = 1; i <= 9; i++) {
						for(int j = 0; j < (num1-num2); j++) {
							System.out.print(num1);
						}
					}
					return;
				}
				else if(num1 < num2) {
					for(int i = 1; i <= 9; i++) {
						
					}
					return;
				}
			}
			else
				System.out.println("INPUT ERROR!");
		}
	}

}
