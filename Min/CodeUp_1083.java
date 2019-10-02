package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//3이 들어갈 때마다 문자 출력하고 싶은데, 실패..
public class CodeUp_1083 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int num1 = sc.nextInt();
		
		String[] str_arr = new String[num1];
		
		for(int i = 1; i <= num1; i++) {
			String str = i + "";
			if(str.equals("3") || str.equals("6") || str.equals("9"))
				System.out.print("X ");
			else
				System.out.print(i + " ");
		}
		
	}

}
