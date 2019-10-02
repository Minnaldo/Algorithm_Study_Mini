package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1098 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] arr = new int[h+1][w+1];
		
		int n = sc.nextInt();
		for(int t = 0; t < n; t++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int i = 0; i < l; i++) {
				if(d == 0 ) {
					arr[x][y+i] = 1;
				}
				else if(d == 1) {
					arr[x+i][y] = 1;
				}
			}
		}
		
		
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}