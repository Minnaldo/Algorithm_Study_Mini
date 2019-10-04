package SWEA_D2;

import java.util.Scanner;

public class 알람시계_백준 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int result = 0;
		result = H-1;
		
		if(M >= 45) {
			System.out.println(H + " " + (M-45));
		}
		else {
			if(H-1 < 0)
				result = 23;
			System.out.println(result + " " + (60+(M-45)));
		}
	}

}
