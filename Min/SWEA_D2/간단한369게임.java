package SWEA_D2;

import java.util.Scanner;

public class 간단한369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {
			int a = i / 10, b = i % 10;
			if(a == 3 || a == 6 || a == 9) {
				if(b == 3 || b == 6 || b == 9) {
					System.out.print("-- ");
					continue;
				}
				System.out.print("- ");
			}
			
			else if(b == 3 || b == 6 || b == 9) {
				System.out.print("- ");
			}
			
			else
				System.out.print(i + " ");
		}
	}

}
