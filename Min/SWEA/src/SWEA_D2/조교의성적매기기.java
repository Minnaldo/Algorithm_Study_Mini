package SWEA_D2;

import java.util.Arrays;
import java.util.Scanner;

public class 조교의성적매기기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <=T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			double[] arr = new double[N];
			double[] brr = new double[N];
			for(int i = 0; i < N; i++) {
				double num1 = sc.nextInt();
				double num2 = sc.nextInt();
				double num3 = sc.nextInt();
				
				arr[i] = num1*(0.35) + num2*(0.45) + num3*(0.20);
				brr[i] = num1*(0.35) + num2*(0.45) + num3*(0.20);
				
//				System.out.println(arr[i]);
			}
			
			Arrays.sort(arr);
			
//			for(int i = 0; i < N; i++) {
//				System.out.println("arr : " + arr[i]);
//				System.out.println("brr : " + brr[i]);
//			}
			
			for(int i = 0; i < N; i++) {
				if(arr[i] == brr[K-1])
				{
					if(i == 0)
						System.out.println("#" + tc + " D0");
					if(i == 1)
						System.out.println("#" + tc + " C-");
					if(i == 2)
						System.out.println("#" + tc + " C0");
					if(i == 3)
						System.out.println("#" + tc + " C+");
					if(i == 4)
						System.out.println("#" + tc + " B-");
					if(i == 5)
						System.out.println("#" + tc + " B0");
					if(i == 6)
						System.out.println("#" + tc + " B+");
					if(i == 7)
						System.out.println("#" + tc + " A-");
					if(i == 8)
						System.out.println("#" + tc + " A0");
					if(i == 9)
						System.out.println("#" + tc + " A+");
				}
			}
			
		}
	}

}
