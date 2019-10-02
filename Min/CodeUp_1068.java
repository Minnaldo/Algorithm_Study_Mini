package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1068 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		
		if(num1 >= 90 && num1 <= 100)
			System.out.println("A");
		if(num1 >= 70 && num1 <= 89)
			System.out.println("B");
		if(num1 >= 40 && num1 <= 69)
			System.out.println("C");
		if(num1 >= 0 && num1 <= 39)
			System.out.println("D");
		
	}

}
