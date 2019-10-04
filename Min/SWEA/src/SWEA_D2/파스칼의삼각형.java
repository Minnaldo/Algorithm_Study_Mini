package SWEA_D2;

import java.util.Scanner;

public class 파스칼의삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			int[][] num = new int[N][N];
			
			System.out.println("#" + tc);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= i; j++) {
					if(i == j)
						num[i][j] = 1;
					
					else if(j == 0)
						num[i][j] = 1;
					
					else
						num[i][j] = num[i-1][j] + num[i-1][j-1];
					
					System.out.print(num[i][j] + " ");
				}
			
				System.out.println();
			}
			
			
		}
	}

}
