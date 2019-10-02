package CodeUp;


import java.util.Scanner;

public class CodeUp_1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
			
		String[] strstr = str.split("\\."); // split(".")로 작성할 경우 빈배열로 인식
											// ("\\.") or ("[.]") 두가지 방법이 있다.

		String str_first = strstr[0];
		String str_second = strstr[1];

		System.out.println(str_first);
		System.out.println(str_second);
	}

}
