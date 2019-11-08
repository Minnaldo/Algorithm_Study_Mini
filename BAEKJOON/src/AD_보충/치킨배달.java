package AD_보충;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 치킨배달 {

	static int N;
	static int M;
	
	static int[][] map;
	static int[][] check;
	
	static int result;
	
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	static boolean inMap (int x, int y) {
		return x >= 1 && x <= N && y >= 1 && y <= N;
	}
	
//	static class Pair {
//		int x = 0, y = 0;
//		int count = 0;
//		
//		Pair(int x, int y, int count) {
//			this.x = x;
//			this.y = y;
//			this.count = count;
//		}
//	}
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][N+1];
		check = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		result = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(map[i][j] == 1 && check[i][j] == 0) {
					check[i][j] = 1;
					DFS(i, j);
				}
			}
		}
		
		
		
	}

	private static void DFS(int x, int y) {
		
		int distance = 0;
		int min_distance = Integer.MAX_VALUE;
		
		for(int tt = 0; tt < dx.length; tt++) {
			int nx = x + dx[tt];
			int ny = y + dy[tt];
			
			if(inMap(nx, ny) && map[nx][ny] == 2) {				
				distance = Math.abs(x - nx) + Math.abs(y - ny);
				min_distance = Math.min(distance, min_distance);
			}
			
		}
	}

}
