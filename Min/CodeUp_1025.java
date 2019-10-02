package CodeUp;

import java.util.Scanner;

public class CodeUp_1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		int a = (num/10000)*10000;
		int b = ((num-a)/1000)*1000;
		int c = ((num-a-b)/100)*100;
		int d = ((num-a-b-c)/10)*10;
		int e = (num-a-b-c-d);
		
		System.out.println("["+a+"]");
		System.out.println("["+b+"]");
		System.out.println("["+c+"]");
		System.out.println("["+d+"]");
		System.out.println("["+e+"]");
	}

}
