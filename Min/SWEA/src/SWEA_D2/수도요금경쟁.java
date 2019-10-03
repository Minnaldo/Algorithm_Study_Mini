package SWEA_D2;

import java.util.Scanner;

public class 수도요금경쟁 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
						
			int result_A = 0;
			int result_B = 0;
			int result = 0;
			
			
			result_A = W*P;
			if(W <= R) {	
				result_B = Q;
//				if(result_A < result_B)
//					result = result_A;
//				else if(result_B < result_A)
//					result = result_B;
			}
			else
				result_B = Q+(W-R)*S;
				
			result = Math.min(result_A, result_B);
			
			System.out.println("#" + tc + " " + result);
			
		}
	}

}
