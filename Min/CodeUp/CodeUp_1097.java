package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1097 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[20][20];
		
		for(int i = 1; i <=19; i++) {
			for(int j = 1; j <=19; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		for(int tt = 0; tt < n; tt++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int i = 1; i <=19; i++) {
				if(arr[x][i] == 1)
					arr[x][i] = 0;
				else
					arr[x][i] = 1;
				
				if(arr[i][y] == 1)
					arr[i][y] = 0;
				else
					arr[i][y] = 1;
			}
		}
		
		for(int i = 1; i <= 19; i++) {
			for(int j = 1; j <= 19; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}