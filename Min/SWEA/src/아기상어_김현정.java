import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 아기상어_김현정 {
	static class pos implements Comparable<pos>{
		int y, x, cnt;

		public pos(int y, int x, int cnt) {
			this.y = y;
			this.x = x;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(pos o) {
			// TODO Auto-generated method stub
			if((this.cnt == o.cnt)&&(this.y != o.y)) {
				return this.y-o.y;
			}
			else if((this.cnt == o.cnt)&&(this.y == o.y)) {
				return this.x-o.x;
			}
			return this.cnt-o.cnt;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[N][N];
		boolean[][] visited = new boolean[N][N];
		Queue<pos> list = new LinkedList<>();
		int shark_y = 0, shark_x = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j]==9) {
					map[i][j] = 0;
					visited[i][j] = true;
					list.add(new pos(i, j, 0));
					shark_y = i;
					shark_x = j;
				}
			}
		}
		int cnt = 0;
		int feed = 0;
		int size = 2;
		int[][] delta = {{-1,0},{1,0},{0,-1},{0,1}};
		ArrayList<pos> path = new ArrayList<>();
		boolean shortest = false;
		boolean check = false;
		int result = 0;
		loop : while(!list.isEmpty()) {
			
			
			
			int y = list.peek().y;//이동 좌표
			int x = list.peek().x;
			cnt = list.poll().cnt;
			
			check = false;
			for (int i = 0; i < 4; i++) {
				int r = y + delta[i][0];
				int c = x + delta[i][1];
				if(r<0 || c<0 || r>=N || c>=N) continue;
				
				if(map[r][c] > size) continue;
				
				if(!visited[r][c]) {
					if(map[r][c] == 0 || map[r][c] == size) {
						check = true;
						visited[r][c] = true;
						list.add(new pos(r,c,cnt+1));
					}
					
					else if(map[r][c] < size) {
						shortest = true;
						check = true;
						result = cnt;
						list.add(new pos(-1,-1,-1));
						path.add(new pos(r,c,cnt+1));
					}
					
				}
				
				
			}
			if(!check && shortest) {
				list.add(new pos(-1,-1,-1));
			}
			
			
			if(shortest && result != list.peek().cnt) {
				feed++;
				if(feed == size) {
					size++;
					feed=0;
				}
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						visited[i][j] = false;
					}
				}
				shortest = false;
				list.clear();
				Collections.sort(path);
				shark_y = path.get(0).y;
				shark_x = path.get(0).x;
				map[shark_y][shark_x] = 0;
				
				boolean can = false;
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if(map[i][j] !=0 && map[i][j] < size) can = true;
					}
				}
				if(!can) {
					result = cnt+1;
					break loop;
				}
				result = cnt+1;
				list.add(new pos(shark_y, shark_x, cnt+1));
				path.clear();
			}

			
		}
		
		System.out.println(result);
	}

}