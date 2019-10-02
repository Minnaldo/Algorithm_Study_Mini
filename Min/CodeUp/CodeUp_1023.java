package CodeUp;


import java.util.Scanner;

public class CodeUp_1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
			
		char[] strstr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			strstr[i] = str.charAt(i);
			
			System.out.println("'"+strstr[i]+"'");
		}
		
		
	}

}
