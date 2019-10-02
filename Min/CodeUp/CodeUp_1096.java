package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1096 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int white = 0;
		int black = 0;

		int[][] arr = new int[20][20];
		for(int i = 1; i <= num; i++) {			
			white = sc.nextInt();
			black = sc.nextInt();
			
			arr[white][black] = 1;
		}
		
		for(int i = 1; i <= 19; i++) {
			for(int j = 1; j <= 19; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}