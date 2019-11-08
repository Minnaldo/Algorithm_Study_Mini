package Computation_Thinking;

import java.util.Scanner;

public class Computation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(T(sc.nextInt()));
	}

	private static int T(int nextInt) {
		if(nextInt == 1)
			return 1;
		
		return 3*T(nextInt-1) + 6;
	}
}
