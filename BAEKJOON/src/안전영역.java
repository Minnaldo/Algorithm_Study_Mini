import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 안전영역 {

	static int N;
	static int k;

	static int[][] map;
	static int[][] check;

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static boolean inMap (int x, int y) {
		return x >= 1 && x <= N && y >= 1 && y <= N;
	}

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		map = new int[N+1][N+1];
		check = new int[N+1][N+1];

		int max_input_value = 0;
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());

				max_input_value = Math.max(max_input_value, map[i][j]);
			}
		}


		int cnt; int result = 0;
		for(k = 0; k <= 100; k++) {
			cnt = 0;

			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					check[i][j] = 0;
				}
			}

			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					//map이 k보다 크고 방문 안했으면 검사
					if(map[i][j] > k && check[i][j] == 0) {
						check[i][j] = 1;
						DFS(i, j);
						cnt++;
					}
				}
			}

			result = Math.max(cnt, result);
		}


		System.out.println(result);
	}

	private static void DFS(int x, int y) {
		for(int tt = 0; tt < dx.length; tt++) {
			int nx = x + dx[tt];
			int ny = y + dy[tt];

			if(inMap(nx, ny) && map[nx][ny] > k && check[nx][ny] == 0) {
				check[nx][ny] = 1;
				DFS(nx, ny);
			}
		}
	}
}

