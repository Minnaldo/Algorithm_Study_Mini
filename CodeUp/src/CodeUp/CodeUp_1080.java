package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1080 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		long num = sc.nextLong();
		long result = 0;
		long cnt = 0;
		while(true) {
			
			if(num <= result) {
				System.out.println(cnt);
				return;
			}
			
			cnt++;
			result += cnt;
			
		}
		
	}

}
