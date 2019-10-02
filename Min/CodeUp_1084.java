package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//시간초과 뜸...
public class CodeUp_1084 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < num1; i++) {
			for(int j = 0; j < num2; j++) {
				for(int k = 0; k < num3; k++) {
					System.out.println(i + " " + j + " " + k);
//					cnt++;
				}
			}
		}
		
		System.out.println(num1*num2*num3);
		
	}

}
