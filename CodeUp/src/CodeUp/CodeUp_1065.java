package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 % 2 == 0)
			System.out.println(num1);
		if(num2 % 2 == 0)
			System.out.println(num2);
		if(num3 % 2 == 0)
			System.out.println(num3);
		
	}

}
