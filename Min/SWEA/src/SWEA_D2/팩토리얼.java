package SWEA_D2;

import java.util.Scanner;

public class 팩토리얼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int result = 1;
		for(int i = N; i >= 1; i--) {
			result *= i;
		}
		
		System.out.println(result);
	}

}
