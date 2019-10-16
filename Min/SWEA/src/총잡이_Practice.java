import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 총잡이_Practice {

	static int T;
	static int N;
	static int M;
	static int result;
	static char[][] map;
	static boolean[] visited;

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static boolean inMap(int x, int y) {
		return x>=0 && y>=0 && x < N && y < M;
	}

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			map = new char[N][M];

			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < M; j++) {
					map[i][j] = st.nextToken().charAt(0);
				}
			}

			result = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(map[i][j] == 'G') {
						result += DFS(i, j);
					}
				}
			}

			bw.write(result +"");
			bw.flush();
		}
	}

	private static int DFS(int x, int y) {
		int cnt = 0;
		
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			while(inMap(nx,ny) && map[nx][ny] != 'W') {
				if(map[nx][ny] == 'G')
					break;
				if(map[nx][ny] == 'T') {
					cnt++;
					map[nx][ny] = 'A';
					break;
				}
				
				nx += dx[i];
				ny += dy[i];
			}
		}
		
		return cnt;
	}

}
