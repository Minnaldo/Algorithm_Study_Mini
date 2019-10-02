package CodeUp;

import java.util.Scanner;

public class CodeUp_1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		String str = sc.nextLine();
		
		String[] strstr = str.split("\\.");
		
		String str1 = strstr[0];
		String str2 = strstr[1];
		String str3 = strstr[2];

		System.out.println(str3+"-"+str2+"-"+str1);
	}

}
