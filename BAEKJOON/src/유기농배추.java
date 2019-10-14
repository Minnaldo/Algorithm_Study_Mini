import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 유기농배추 {

	static int T;	//테스트 케이스
	static int M;	//배추밭 가로길이
	static int N;	//배추밭 세로길이
	static int K;	//배추가 심어져 있는 위치의 개수
	static int result;

	static int[][] map;
	static boolean[] visited;

	static BufferedReader br;
	static BufferedWriter bw;

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static boolean inMap(int x, int y) {
		return x >= 0 && y >= 0 && x < M && y < N;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			map = new int[N+2][M+2];

			for(int tt = 0; tt < K; tt++) {
				st = new StringTokenizer(br.readLine());
				int temp1 = Integer.parseInt(st.nextToken());
				int temp2 = Integer.parseInt(st.nextToken());

				map[temp2][temp1] = 1;
			}

			result = 0;
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < N; j++) {
					if(map[i][j] == 1) {
						result++;
						dfs(i, j);
					}
				}
			}

			bw.write(result);
			bw.write("\n");
			bw.flush();
		}
	}
	
	

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		map[x][y] = 0;
		
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(map[nx][ny] == 1) {
				dfs(nx,ny);
			}
		}
	}



}
