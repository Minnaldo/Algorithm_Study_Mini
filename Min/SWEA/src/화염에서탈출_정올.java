import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 화염에서탈출_정올 {
	static class Pos {
		int r, c, time;
		Pos(int r, int c, int time) {
			this.r = r;
			this.c = c;
			this.time = time;
		}
	}
	
	
	static int R, C;
	static Scanner sc = new Scanner(System.in);
	static int[][] arr;	
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static boolean inArr(int x, int y)
	{
		return x >= 0 && y >= 0 && x <= R && y <= C;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new int[R][C];
		
		Queue<Pos> fireQueue = new LinkedList<>();
		Queue<Pos> queue = new LinkedList<>();
		for(int i = 0; i < R; i++) {
			String str = br.readLine();
			for(int j = 0; j < C; j++) {
				switch (str.charAt(j)) {
				case 'D':
					arr[i][j] = -9;
					break;
				case 'S':
					//지섭이의 처음 위치
					queue.add(new Pos(i, j, 1));
					break;
				case '*':
					arr[i][j] = 1;
					fireQueue.add(new Pos(i, j, 1));
					break;
				case 'X':
					arr[i][j] = -1;
					break;
					
				}
			}
		}
		
		while( !fireQueue.isEmpty() ) {
			Pos pos = fireQueue.poll();
			for(int i = 0; i < 4; i++) {
				int nr = pos.r + dx[i];
				int nc = pos.c + dy[i];
				if( nr < 0 || nc < 0 || nr >= R || nc >= C )
					continue;
				if( arr[nr][nc] == 0 ) {
					arr[nr][nc] = pos.time + 1;
					fireQueue.add(new Pos(nr, nc, pos.time + 1));
				}
			}
		}
		
		int ans = 0;
		//지섭이 큐가 빌 때까지 탐색
		out:while( !queue.isEmpty() ) {
			Pos pos = queue.poll();
			for(int i = 0; i < 4; i++) {
				int nr = pos.r + dx[i];
				int nc = pos.c + dy[i];
				if(nr < 0 || nc < 0 || nr >= R || nc >= C)
						continue;
				if( arr[nr][nc] == -9 || arr[nr][nc] == 0 || arr[nr][nc] > pos.time + 1) {
					if (arr[nr][nc] == -9) {
						ans = pos.time;
						break out;
					}
					arr[nr][nc] = pos.time;
					queue.add(new Pos(nr, nc, pos.time+1));
				}
			}
		}
		System.out.println(ans == 0 ? "impossible": ans);
	}

	
}
