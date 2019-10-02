package CodeUp;


import java.util.Scanner;

public class CodeUp_1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String[] strstr = str.split("-");
		
		String str_first = strstr[0];
		String str_second = strstr[1];
		
		System.out.println(str_first + str_second);
	}

}
