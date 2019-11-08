import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 적록색약 {

	static int N;

	static char[][] map;
	static int[][] check;

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static boolean inMap(int x, int y) {
		return x >= 1 && x <= N && y >= 1 && y <= N;
	}

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		map = new char[N+2][N+2];
		check = new int[N+2][N+2];


		//input값 입력  map배열 생성
		for(int i = 1; i <= N; i++) {
			String str = br.readLine();
			for(int j = 1; j <= N; j++) {
				map[i][j] = str.charAt(j-1);
			}
		}
		//일반사람 DFS
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(check[i][j] == 0) {
					DFS(i, j, map[i][j]);
					cnt++;
				}
			}
		}


		//		Arrays.fill(check, 0); //check배열 0으로 초기화
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				check[i][j] = 0;
			}
		}
		//R과 G를 같은걸로 보기위해 G를 R로 바꿔줌.
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(map[i][j] == 'G')
					map[i][j] = 'R';
			}
		}
		//적록색약 DFS
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(check[i][j] == 0) {
					JRSY_DFS(i, j, map[i][j]);
					JRSY_cnt++;
				}
			}
		}



		System.out.println(cnt + " " + JRSY_cnt);
	}


	static int JRSY_cnt = 0;
	private static void JRSY_DFS(int x, int y, char RGB) {

		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(inMap(nx, ny) && check[nx][ny] == 0) {
				if(RGB == map[nx][ny]) {
					check[nx][ny] = 1;
					JRSY_DFS(nx, ny, map[nx][ny]);
				}
			}
		}

	}


	static int result;
	static int cnt = 0;
	//일반사람
	private static void DFS(int x, int y, char RGB) {

		//		System.out.println(x + " " + y + " " + map[x][y]);

		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(inMap(nx, ny) && check[nx][ny] == 0) {
				if(RGB == map[nx][ny]) {
					check[nx][ny] = 1;
					DFS(nx, ny, map[nx][ny]);
				}

			}
		}

	}



}


