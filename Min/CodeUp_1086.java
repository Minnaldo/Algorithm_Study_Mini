package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		double num3 = sc.nextInt();
		
		double result = (num1*num2*num3)/1024/1024/8;
		
		System.out.println(String.format("%.2f", result) + " MB");
	}

}
