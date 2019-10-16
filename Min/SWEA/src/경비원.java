import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 경비원 {

	static int N;
	static int M;
	static int K;
	static int shop_direction;
	static int shop_distance;
	static int dong_direction;
	static int dong_distance;
	static int result;
	
	static int[][] map;
	
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	static boolean inMap(int x, int y) {
		return x>=0 && y>=0 && x < N && y < M;
	}
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in)); 
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		
		map = new int[M+10][N+10];
		
		//끝을 1로 채워주는 이유는 끝만 돌기 위해서.
		for(int i = 0; i <= N; i++) {	//북, 남쪽 끝 방향에 map을 1로 채워줌.
			map[0][i] = 1;
			map[M][i] = 1;
		}
		
		for(int i = 0; i <= M; i++) {	//서, 동쪽 끝 방향에 map을 1로 채워줌.
			map[i][0] = 1;
			map[i][N] = 1;
		}
		
		for(int tc = 0; tc < K; tc++) {
			st = new StringTokenizer(br.readLine());
			int shop_direction = Integer.parseInt(st.nextToken());
			int shop_distance = Integer.parseInt(st.nextToken());
			
			
			if(shop_direction == 1) {		//북쪽
				map[0][shop_distance] = 2;
			}
			
			else if(shop_direction == 2) {	//남쪽
				map[M][shop_distance] = 2;
			}
			
			else if(shop_direction == 3) {	//서쪽
				map[shop_distance][0] = 2;
			}
			
			else if(shop_direction == 4) {	//동쪽
				map[shop_distance][N] = 2;
			}
			
		}
		st = new StringTokenizer(br.readLine());
		dong_direction = Integer.parseInt(st.nextToken());
		dong_distance = Integer.parseInt(st.nextToken());
		//동근이 위치
		if(dong_direction == 1) {
			map[0][dong_distance] = 7;
		}
		else if(dong_direction == 2) {
			map[M][dong_distance] = 7;
		}
		else if(dong_direction == 3) {
			map[dong_distance][0] = 7;
		}
		else if(dong_direction == 4) {
			map[dong_distance][N] = 7;
		}
		
		
		result = 0;
		for(int i = 0; i <= M; i++) {
			for(int j = 0; j <= N; j++) {
				if(map[i][j] == 7) {
					result += DFS(i, j);
				}
			}
		}
		
		
		
		
		for(int i = 0; i <= M; i++) {
			for(int j = 0; j <= N; j++) {
				bw.write(map[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
	}

	private static int DFS(int x, int y) {
		
		int cnt = 0;
		
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
									
			if(inMap(nx,ny) && map[nx][ny] == 1) {
				cnt++;
				DFS(nx,ny);
			}
			
			else if(inMap(nx,ny) && map[nx][ny] == 2) {
				cnt++;
				map[nx][ny] = 1;
				break;
			}
			
		}
		
		return cnt;
	}

}
