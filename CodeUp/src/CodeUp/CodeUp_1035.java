package CodeUp;

import java.util.Scanner;

public class CodeUp_1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		//Integer.valueOf() 를 사용하여 16진수를 10진수로 변환.
		int change = Integer.valueOf(str, 16);
		
		//8진수로 변환!
		String result = Integer.toOctalString(change);
		
//		String binaryString = Integer.toBinaryString(i);	//2진수
//		String octalString = Integer.toOctalString(i);		//8진수
//		String hexString = Integer.toHexString(i);			//16진수
		
		System.out.println(result);	//%x : 16진수(소문자), %o : 8진수 , %d : 10진수
										//%X : 16진수(대문자)
	}

}
