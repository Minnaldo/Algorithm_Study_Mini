package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1077 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		int num = sc.nextInt();
		int result = 0;
		
		while(true) {
			
			System.out.println(result);
			
			if(num == result) {
				return;
			}
			
			result++;
		}
		
	}

}
