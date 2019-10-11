import java.util.Scanner;

public class 동철이의프로그래밍_그냥 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] arr = new int[N][M];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int[] sum = new int[N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(arr[i][j] == 1)
						sum[i]++;
				}
			}
			
			int max = 0;
			for(int i = 0; i < N; i++) {
				max = Math.max(max, sum[i]);
			}
			
			int cnt = 0;
			for(int i = 0; i < N; i++) {
				if(max == sum[i])
					cnt++;
			}
			
			System.out.println("#" + tc + " " + cnt + " " + max);
			
		}
	}

}
