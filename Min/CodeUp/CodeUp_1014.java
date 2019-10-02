package CodeUp;
import java.util.Scanner;

public class CodeUp_1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();
		
		char[] c1 = new char[str1.length()];
		char[] c2 = new char[str2.length()];
		
		for(int i = 0; i < str1.length(); i++) {
			c1[i] = str1.charAt(i);
		}
		for(int i = 0; i < str2.length(); i++) {
			c2[i] = str2.charAt(i);
		}

		for(int i = 0; i < c2.length; i++) {
			System.out.print(c2[i] + " ");
		}
		
		for(int i = 0; i < c1.length; i++) {
			System.out.print(c1[i]);
		}
		
	}

}
