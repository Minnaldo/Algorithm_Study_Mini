import java.util.Scanner;

public class 숫자사각형4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int[][] arr = new int[num1+1][num1+1];

		int cnt = 1;

		if(num2 == 1) {
			for(int i = 1; i <= num1; i++) {
				for(int j = 1; j <= num1; j++) {
					arr[i][j] = i;
				}
			}

			for(int i = 1; i <= num1; i++) {
				for(int j = 1; j <= num1; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}


		else if(num2 == 2) {
			for(int i = 1; i <= num1; i++) {
				cnt = 1;
				if(i % 2 == 1) {
					for(int j = 1; j <= num1; j++) {
						arr[i][j] = cnt++;
					}
				}
				else {
					for(int j = num1; j >= 1; j--) {
						arr[i][j] = cnt++;
					}
				}
			}

			for(int i = 1; i <= num1; i++) {
				for(int j = 1; j <= num1; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}


		else if(num2 == 3) {
			for(int i = 1; i <= num1; i++) {
				for(int j = 1; j <= num1; j++) {
					System.out.print(i*j + " ");
				}
				System.out.println();
			}
		}
	}

}
