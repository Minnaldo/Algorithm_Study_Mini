package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1069 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);
		
		if(c == 'A')
			System.out.println("best!!!");
		else if(c == 'B')
			System.out.println("good!!");
		else if(c == 'C')
			System.out.println("run!");
		else if(c == 'D')
			System.out.println("slowly~");
		else
			System.out.println("what?");
	}

}
