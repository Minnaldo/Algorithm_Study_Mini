package CodeUp;

import java.util.Scanner;

public class CodeUp_1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		String str = sc.nextLine();
		
		String[] strstr = str.split(":");
		
		int hour = Integer.parseInt(strstr[0]);
		int minute = Integer.parseInt(strstr[1]);
		int second = Integer.parseInt(strstr[2]);
		
		System.out.println(minute);
	}

}
