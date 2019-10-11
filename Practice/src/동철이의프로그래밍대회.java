import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 동철이의프로그래밍대회 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[][] arr = new int[N][M];
			int[] sum = new int[M];
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < M; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(arr[i][j] == 1)
						sum[i]++;
				}
			}

			int cnt = 0;
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < N; i++) {
				max = Math.max(max, sum[i]);
			}
			for(int i = 0; i < N; i++) {
				if(max == sum[i]) {
					cnt++;
				}
			}

			bw.write("#"+tc+ " " + cnt + " " + max + "\n");
			bw.flush();
		}
	}

}
