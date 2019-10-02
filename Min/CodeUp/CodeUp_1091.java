package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1091 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long m = sc.nextLong();
		long d = sc.nextLong();
		long n = sc.nextLong();

		long result = a;
		for(int i = 1; i < n; i++) {
			result = result * m + d;
		}
		
		System.out.println(result);

	}
}