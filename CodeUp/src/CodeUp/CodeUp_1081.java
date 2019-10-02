package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1081 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(int i = 1; i <= num1; i++) {
			for(int j = 1; j <= num2; j++) {
				System.out.println(i + " " + j);
			}
		}
		
	}

}
