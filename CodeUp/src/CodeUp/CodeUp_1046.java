package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1046 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		long num3 = sc.nextInt();
		
	
		System.out.println(num1+num2+num3);
		System.out.printf("%.1f", (double)(num1+num2+num3)/3);
		
	}

}
