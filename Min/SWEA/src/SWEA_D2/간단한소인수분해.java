package SWEA_D2;

import java.util.Scanner;

public class 간단한소인수분해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = {2, 3, 5, 7, 11};
		
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] cnt = new int[5];
			
			for(int i = 0; i < 5; i++) {
				
				while(true) {
					
					if(N % num[i] != 0)
						break;
					
					N /= num[i];
					cnt[i]++;
					
				}
			}
			
			System.out.print("#" + tc + " ");
			for(int i = 0; i < 5; i++) {
				System.out.print(cnt[i] + " ");
			}
			System.out.println();
		}
	}

}
