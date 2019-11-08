package Computation_Thinking;

import java.util.Scanner;

public class 조합_Professional_5607 {
	static final int P = 1234567891;
	public static void main(String[] args) {
		long[] factorial = new long[1000001];
		factorial[1] = 1;
		for(int i = 2; i < factorial.length; i++)
			factorial[i] = factorial[i-1] * i % P;
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int R = sc.nextInt();
			long result = factorial[N] * power( factorial[N-R] * factorial[R] % P , P-2) %P;
			System.out.println("#" + tc + " " + result);
		}

	}
	static long power(long base , int ex) {
		if( ex == 1 )
			return base;

		long result = power(base, ex/2);
		if( ex % 2 == 0 ) {
			return result * result % P;
		}
		else {
			return result * result % P * base % P;
		}
	}
}
