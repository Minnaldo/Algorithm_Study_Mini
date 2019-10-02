package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1087 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int num1 = sc.nextInt();
		int cnt = 0;
		int result = 0;
		
		while(true) {
			cnt++;
			result += cnt;
			if(result >= num1) {
				System.out.println(result);
				return;
			}
		}
	}

}
