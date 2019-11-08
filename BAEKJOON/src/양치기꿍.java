import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 *   -같은 울타리 안에서
 *   -양 수 >  늑대 수    ->  늑대가 잡아먹힘.
 *   -양 수 <= 늑대 수  ->   양이 잡아먹힘.
 *   - '.':빈 공간   '#':울타리  'v':늑대  'k':양
 *   -결과 : 살아남는 양과 늑대의 수 출력
 */

public class 양치기꿍 {

	static int R;	//Row
	static int C;	//Column

	static char[][] map;	
	static int[][] check;
	
	static int v_cnt;
	static int k_cnt;
	
	static int yang_cnt;
	static int wolf_cnt;

	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = { 0, 0, -1, 1};
	
	static boolean inMap(int x, int y) {
		return x >= 1 && x <= R && y >= 1 && y <= C;
	}

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		//맵 겉을 울타리로 둘러싸기 위해
		//배열 크기보다 +2만큼씩을 더해준다.
		map = new char[R+2][C+2];
		for(int i = 0; i < R+2; i++) {
			for(int j = 0; j < C+2; j++) {
				map[i][j] = '#';
			}
		}
		
		check = new int[R+2][C+2];

		for(int i = 1; i <= R; i++) {
			String str = br.readLine();
			for(int j = 1; j <= C; j++) {
				map[i][j] = str.charAt(j-1);
				//입력배열이 #이면 방문배열을 1로 바꿔버려 입력받을때
				if(map[i][j] == '#') {
					check[i][j] = 1;
				}
			}
		}
		
		
		//DFS
		for(int i = 1; i <= R; i++) {
			for(int j = 1; j <= C; j++) {
				v_cnt = 0;
				k_cnt = 0;
				if(map[i][j] == 'v' && check[i][j] == 0) {
					v_cnt++;
					check[i][j] = 1;
					DFS(i, j);
				}
				
				if(v_cnt >= k_cnt) {
					wolf_cnt += v_cnt;
				}
				else {
					yang_cnt += k_cnt;
				}

			}
		}


		for(int i = 1; i <= R; i++) {
			for(int j = 1; j <= C; j++) {
				if(map[i][j] == 'k' && check[i][j] == 0) {
					k_cnt++;
				}
			}
		}
		yang_cnt += k_cnt;
		
		System.out.println(yang_cnt + " " + wolf_cnt);
		
		
	}

	private static void DFS(int x, int y) {
		
		
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(inMap(nx, ny) && check[nx][ny] == 0) {
				if(map[nx][ny] == 'v') {
					v_cnt++;
					check[nx][ny] = 1;
					DFS(nx, ny);
				}
				if(map[nx][ny] == 'k') {
					k_cnt++;
					check[nx][ny] = 1;
					DFS(nx, ny);
				}
				if(map[nx][ny] == '.') {
					check[nx][ny] = 1;
					DFS(nx, ny);
				}
				
				
			}
			
		}
	}
	

}
