import java.util.Scanner;

public class 숫자삼각형 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int[][] arr = new int[num1+1][num1+1];

		while(true) {
			if(num1 % 2 == 0 ||num1 > 100 || num2 > 3 || num2 < 1) {
				System.out.println("INPUT ERROR!");
				break;
			}

			int cnt = 1;
			if(num2 == 1) {
				for(int i = 1; i <= num1; i++) {
					if(i % 2 == 0) {
						for(int j = i; j >= 0; j--) {
							arr[i][j] = cnt++;
						}
						cnt--;
					}
					
					else if(i % 2 == 1) {
						for(int j = 1; j <= i; j++) {
							arr[i][j] = cnt++;
						}
					}
				}
				
				for(int i = 1; i <= num1; i++) {
					for(int j = 1; j <= num1; j++) {
						if(arr[i][j] == 0) {
							continue;
						}
						else
							System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
			
		
			else if(num2 == 2) {
				for(int i = 0; i < num1; i++) {
					for(int j = 0; j < i; j++) {
						System.out.print("  ");
					}
					for(int k = 2*i; k < num1*2-1; k++) {
						System.out.print(i + " ");
					}
					System.out.println();
					
				}
				break;
			}
			
			else if(num2 == 3) {
				int[][] brr = new int[num1+1][num1+1];
				
				for(int i = 1; i <= num1; i++) {
					for(int j = 1; j <= i; j++) {
						brr[i][j] = j;
					}
				}
				
				for(int i = 1; i <= num1/2; i++) {
					for(int j = 1; j <= num1; j++) {
						if(brr[i][j] == 0)
							continue;
						else
							System.out.print(brr[i][j] + " ");
					}
					System.out.println();
				}
				for(int i = num1/2+1; i <= num1; i++) {
					for(int j = 1; j <= num1-i+1; j++) {
						if(brr[i][j] == 0)
							continue;
						else
							System.out.print(brr[i][j] + " ");
					}
					System.out.println();
				}
				
				break;
			}


		}
	}
}
