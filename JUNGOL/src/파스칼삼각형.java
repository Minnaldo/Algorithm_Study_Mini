import java.util.Scanner;

public class 파스칼삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int[][] arr = new int[num1][num1];

		if(num2 == 1) {
			for(int i = 0; i < num1; i++) {
				for(int j = 0; j <= i; j++) {
					if(i == j) {
						arr[i][j] = 1;
					}
					else if(j == 0) {
						arr[i][j] = 1;
					}
					else arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
			
			for(int i = 0; i < num1; i++) {
				for(int j = 0; j < num1; j++) {
					if(arr[i][j] == 0)
						continue;
					else
						System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		if(num2 == 2) {
			for(int i = 0; i < num1; i++) {
				for(int j = 0; j <= i; j++) {
					if(i == j) {
						arr[i][j] = 1;
					}
					else if(j == 0) {
						arr[i][j] = 1;
					}
					else arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
			
			for(int i = num1-1; i >= 0; i--) {
				for(int j = num1-1; j >= 0; j--) {
					if(arr[i][j] == 0)
						continue;
					else {
						System.out.print(arr[i][j] + " ");
					}
				}
				
				System.out.println();
				for(int k = num1-1; k >= i; k--)
					System.out.print(" ");
			}
		}

		if(num2 == 3) {
			for(int i = 0; i < num1; i++) {
				for(int j = 0; j <= i; j++) {
					if(i == j) {
						arr[i][j] = 1;
					}
					else if(j == 0) {
						arr[i][j] = 1;
					}
					else arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
			
			for(int i = num1-1; i >= 0; i--) {
				for(int j = num1-1; j >= 0; j--) {
					if(arr[j][i] == 0)
						continue;
					else
						System.out.print(arr[j][i] + " ");
				}
				System.out.println();
			}
		}
	}

}
