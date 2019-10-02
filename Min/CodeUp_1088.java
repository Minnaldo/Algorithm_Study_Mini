package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1088 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int num1 = sc.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= num1; i++) {
			
			if(i % 3 == 0)
				continue;
			
			System.out.print(i + " ");
		}
	}

}
