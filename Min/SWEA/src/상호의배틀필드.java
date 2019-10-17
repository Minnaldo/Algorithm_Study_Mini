import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 상호의배틀필드 {

	static int T;			//테스트케이스
	static int H;			//맵의 높이
	static int W;			//맵의 너비
	static char[][] map;	//맵 배열
	static int N;			//사용자 인풋 갯수
	static char[] user_input;	//사용자 입력
	static int tank_direction;	//탱크 방향
	
	static boolean inMap(int x, int y) {
		return x>=0 && y>=0 && x < H && y < W;
	}
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		T = Integer.parseInt(br.readLine());							//테스트케이스
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());						//맵의 높이
			W = Integer.parseInt(st.nextToken());						//맵의 너비
			
			map = new char[H][W];
			
			for(int i = 0; i < H; i++) {
				map[i] = br.readLine().toCharArray();					//맵 map[i][j]에 값을 넣어줌.
				
			}
			
			N = Integer.parseInt(br.readLine());						//사용자 입력 개수
			user_input = new char[N];

			user_input = br.readLine().toCharArray();					//사용자 입력배열에 값을 넣어줌.
						
			int x = 0;
			int y = 0;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(map[i][j] == '<' || map[i][j] == '>' || map[i][j] == 'v' || map[i][j] == '^') {
						x = i;
						y = j;
					}
				}
			}

			for(int i = 0; i < user_input.length; i++) {
				if(user_input[i] == 'U') {		//Up : 전차가 바라보는 방향을 위쪽으로 바꾸고, 한 칸 위의 칸이 평지라면 위 그 칸으로 이동한다.
					map[x][y] = '^';
					if(inMap(x-1, y) && x-1 >= 0) {
						if(map[x-1][y] == '.') {
							map[x][y] = '.';
							map[x-1][y] = '^';	//전차 바라보는 방향을 위로 바꾸고
							x = x-1;			//위 칸으로 이동.
						}
					}
				}
				
				else if(user_input[i] == 'D' ) {	//Down : 전차가 바라보는 방향을 아래쪽으로 바꾸고, 한 칸 아래의 칸이 평지라면 그 칸으로 이동한다.
					map[x][y] = 'v';
					if(inMap(x+1, y) && x+1 >= 0) {
						if(map[x+1][y] == '.') {
							map[x][y] = '.';
							map[x+1][y] = 'v';	//전차 바라보는 방향을 아래로 바꾸고
							x = x+1;			//아래 칸으로 이동.
						}
					}
				}
				
				else if(user_input[i] == 'L') { //Left : 전차가 바라보는 방향을 왼쪽으로 바꾸고, 한 칸 왼쪽의 칸이 평지라면 그 칸으로 이동한다.
					map[x][y] = '<';
					if(inMap(x, y-1) && y-1 >= 0) {
						if(map[x][y-1] == '.') {
							map[x][y] = '.';
							map[x][y-1] = '<';	//전차 바라보는 방향을 왼쪽으로 바꾸고
							y = y-1;			//왼쪽 칸으로 이동.
						}
					}
				}
				
				else if(user_input[i] == 'R' ) {
					map[x][y] = '>';
					if(inMap(x, y+1) && y+1 >= 0 ) {
						if(map[x][y+1] == '.') {
							map[x][y] = '.';
							map[x][y+1] = '>';	//전차 바라보는 방향을 오른쪽으로 바꾸고
							y = y+1;			//오른쪽 칸으로 이동.
						}
					}
				}
				
				else if(user_input[i] == 'S') {
					if(inMap(x, y) && map[x][y] == '<') {
						for(int j = y-1; j >= 0; j--) {
							if(map[x][j] == '#') {	//강철로 만들어진 벽을 만나면
								break;
							}
							else if(map[x][j] == '*') {	//그냥 벽을 만나면
								map[x][j] = '.';
								break;
							}
						}
					}
					else if(map[x][y] == '>') {
						for(int j = y+1; j < W; j++) {
							if(map[x][j] == '#') {
								break;
							}
							else if(map[x][j] == '*') {
								map[x][j] = '.';
								break;
							}
						}
					}
					else if(map[x][y] == '^') {
						for(int j = x-1; j >= 0; j--) {
							if(map[j][y] == '#') {
								break;
							}
							else if(map[j][y] == '*') {
								map[j][y] = '.';
								break;
							}
						}
					}
					else if(map[x][y] == 'v') {
						for(int j = x+1; j < H; j++) {
							if(map[j][y] == '#') {
								break;
							}
							else if(map[j][y] == '*') {
								map[j][y] = '.';
								break;
							}
						}
					}
				}
			}
			
			
			bw.write("#" + tc + " ");
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					bw.write(map[i][j]);
				}
				bw.write("\n");
			}
			bw.flush();
			
//			for(int i = 0; i < H; i++) {
//				for(int j = 0; j < W; j++) {
//					bw.write(map[i][j]+"");
//				}
//				bw.write("\n");
//			}
//			bw.write(N+"\n");
//			for(int i = 0; i < N; i++) {
//				bw.write(user_input[i]+"");
//			}
//			
//			bw.flush();
			
		}
	}

}

/*
1
3 7
***....
*-..#**
#<.****
23
SURSSSSUSLSRSSSURRDSRDS
*/
