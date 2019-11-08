package IM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 재미있는오셀로게임_SWEA_4615 {

	static int T;	//테스트 케이스 수
	static int N;	//보드의 한 변의 길이 N	(4,6,8 중 하나)
	static int M;	//플레이어가 돌을 놓는 횟수
	
	static int[][] map;	//맵
	
	static int x;	//돌을 놓을 x좌표
	static int y;	//돌을 놓을 y좌표
	static int what_dol;	//무슨 돌? white or black?
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			map = new int[N+1][N+1];
			//맵 생성
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				what_dol = Integer.parseInt(st.nextToken());
				
				map[x][y] = what_dol;
				
				
				//4방향 탐색
				if(map[x][y] == 2) {		//내 위치가 백돌(2)일 때,,
//					if( (x-1 < 1 && x-2 < 1) || (x+1 > N && x+2 > N) || (y-1 < 1 && y-2 < 1) || (y+1 > N && y+2 > N) ) {
//						continue;
//					}
					
					if(map[x-1][y] == 1) {		//상이 흑돌(1)이면
						if(map[x-2][y] == 2) {		//내 위치에서 바로 위가 흑돌이고 내가 다시 백돌이라면
							map[x-1][y] = 2;			//백돌(2) 사이에 껴있는 흑돌(1)을 백돌(2)로 바꿔준다.
						}
					}
					else if(map[x+1][y] == 1) {	//하가 흑돌(1)이면
						if(map[x+2][y] == 2) {		//내 위치에서 바로 아래가 흑돌이고 내가 다시 백돌이라면
							map[x+2][y] = 2;			//백돌(2) 사이에 껴있는 흑돌(1)을 백돌(2)로 바꿔준다.
						}
					}
					else if(map[x][y+1] == 1) {	//우가 흑돌(1)이라면
						if(map[x][y+2] == 2) {		//내 위치에서 바로 우측이 흑돌이고 내가 다시 백돌이라면
							map[x][y+2] = 2;			//백돌(2) 사이에 껴있는 흑돌(1)을 백돌(2)로 바꿔준다.
						}
					}
					else if(map[x][y-1] == 1) {	//좌가 흑돌(1)이라면	
						if(map[x][y-2] == 2) {		//내 위치에서 바로 좌측이 흑돌이고 내가 다시 백돌이라면
							map[x][y+2] = 2;			//백돌(2) 사이에 껴있는 흑돌(1)을 백돌(2)로 바꿔준다.
						}
					}
				}
				
				
			}
			
			
			
			
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					bw.write(map[i][j] + " ");
				}
				bw.write("\n");
			}
			
			
			bw.flush();
			
		}
		
	}

}
