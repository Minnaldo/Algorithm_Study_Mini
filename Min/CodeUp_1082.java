package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1082 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		String str = sc.next();
		
		int num = Integer.valueOf(str, 16);
				
		for(int i = 1; i < 16; i++) {
			System.out.printf("%X*%X=%X\n", num, i, num*i);
		}
		
	}

}
