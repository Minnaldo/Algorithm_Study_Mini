import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 유기농배추_Practice {

	static int T;
	static int M;
	static int N;
	static int K;
	static int result;
	
	static int[][] map;
	static boolean[] visited;
	
	static int[] dx = {-1, 1, 0, 0 };
	static int[] dy = {0, 0, -1, 1 };
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			map = new int[N+2][M+2];
			
			for(int i = 1; i <= K; i++) {
				st = new StringTokenizer(br.readLine());
				int temp1 = Integer.parseInt(st.nextToken());
				int temp2 = Integer.parseInt(st.nextToken());
				
				map[temp2+1][temp1+1] = 1;
			}
			
			result = 0;
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= M; j++) {
					if(map[i][j] == 1) {
						result++;
						DFS(i,j);
					}
				}
			}
			
			bw.write(result + "");
			bw.write("\n");
			bw.flush();
		}
	}

	private static void DFS(int x, int y) {
		// TODO Auto-generated method stub
		map[x][y] = 0;
		
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(map[nx][ny] == 1) {
				DFS(nx, ny);
			}
		}
	}

}
