package SWEA_D2;

import java.util.Scanner;

public class 스도쿠검증 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		int[][] arr = new int[9][9];
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			
			for(int i= 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {

					int sum = 0;
					for(int k = j; k < j+3; k++) {
						for(int l = i; l < i+3; l++) {
							sum += arr[k][l];
//							System.out.print(arr[k][l] + " ");
						}
//						System.out.println("===========");
						
					}
					if(sum == 45)
						System.out.println("#" + tc + " 1");
					else {
						System.out.println("#" + tc + " 0");
						break;
					}
					
					j+=2;
					
				}
				i+=2;
				
			}
			
		}
	}

}
