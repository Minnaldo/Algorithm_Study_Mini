package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1076 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		char c = sc.next().charAt(0);
		char result_c = 'a';
		
		while(true)
		{
			System.out.print(result_c + " ");
			
			if(c == result_c) {
				return;
			}
			
			result_c++;
		}
		
	}

}
