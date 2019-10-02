package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1085 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		double num3 = sc.nextInt();
		double num4 = sc.nextInt();
		
		double result = (num1*num2*num3*num4)/1024/1024/8;
		
		System.out.println(String.format("%.1f", result) + " MB");
	}

}
