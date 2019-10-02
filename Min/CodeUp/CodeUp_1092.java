package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1092 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int day = 1;
		while(true) {
			
			if(day%num1==0 && day%num2==0 && day%num3==0)
			{
				System.out.println(day);
				return;
			}
			else
			{
				day++;
			}
		}

	}
}