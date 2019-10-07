import java.util.Scanner;

public class 숫자사각형2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < m; j++) {
					arr[i][j] = cnt++;
				}
			}
			else {
				for(int j = m-1; j >= 0; j--) {
					arr[i][j] = cnt++;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
