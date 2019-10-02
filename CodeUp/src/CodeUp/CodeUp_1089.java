package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1089 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		int result = a;
		for(int i = 1; i < n; i++) {
			result += d;
		}
		
		System.out.println(result);

	}
}