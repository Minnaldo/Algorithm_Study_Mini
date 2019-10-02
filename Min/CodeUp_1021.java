package CodeUp;


import java.util.Scanner;

public class CodeUp_1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] c = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);
		}
		
		for(int i= 0 ; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
	}

}
