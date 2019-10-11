import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 섬의개수 {

	static int[][] arr;
	static int H;
	static int W;
	static int result;
	
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	static boolean inArr(int x, int y) {
		return x >= 0 && y >= 0 && x < H && y < W;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			
			if(H==0&&W==0) return;
			
			arr = new int[H][W];
			
			for(int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < W; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			result = 0;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(arr[i][j] == 1) {
						result++;
						arr[i][j] = -1;
						dfs(i,j);
					}
				}
			}
			
			bw.write(result+"\n");
			bw.flush();
		}
	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(inArr(nx, ny) && arr[nx][ny] == 1) {
				arr[nx][ny] = -1;
				dfs(nx, ny);
			}
		}
	}


}
