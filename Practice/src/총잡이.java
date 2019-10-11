import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 총잡이 {

	static char[][] map;	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	static int N;
	static int M;
	static int result;

	static boolean inMap(int x, int y) {
		return x>=0 && y>=0 && x<N && y<M;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			map = new char[N][M];

			for(int i = 0; i < N; i++) {
				map[i] = st.nextToken().toCharArray();
			}

			result = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(map[i][j] == 'G') {
						
					}
				}
			}
		}
	}

	private static int dfs(int x, int y) {
		int sum = 0;
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			while (inMap(nx, ny) && (map[nx][ny] != 'W')) {
				if (map[nx][ny] == 'G') {
					break;
				}
				if (map[nx][ny] == 'T') {
					//System.out.println(nx+"와"+ny+"에서 팡!!!!!");
					map[nx][ny]='A';
					sum++;
					break;
				}
				nx += nx;
				ny += nx;
			}
		}
		return sum;
	}

}
