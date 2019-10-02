package CodeUp;

import java.util.Scanner;

public class CodeUp_1034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		//Integer.valueOf() 를 사용하여 8진수를 10진수로 변환.
		int result_num = Integer.valueOf(str, 8);
		
		System.out.printf("%d", result_num);	//%x : 16진수(소문자), %o : 8진수 , %d : 10진수
										//%X : 16진수(대문자)
	}

}
