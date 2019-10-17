import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 경비원_Practice {

	static int N;
	static int M;
	static int K;
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

		int[][] shop = new int[K][2];	//shop_direction, shop_distance

		for(int tc = 0; tc < K; tc++) {
			st = new StringTokenizer(br.readLine());
			shop[tc][0] = Integer.parseInt(st.nextToken());		//shop_direction
			shop[tc][1] = Integer.parseInt(st.nextToken());		//shop_distance


			if(shop[tc][0] == 1) {		//북쪽
				map[0][shop[tc][1]] = 2;
			}

			else if(shop[tc][0] == 2) {	//남쪽
				map[M][shop[tc][1]] = 2;
			}

			else if(shop[tc][0] == 3) {	//서쪽
				map[shop[tc][1]][0] = 2;
			}

			else if(shop[tc][0] == 4) {	//동쪽
				map[shop[tc][1]][N] = 2;
			}

		}

		int[] dong = new int[2];

		st = new StringTokenizer(br.readLine());
		dong[0] = Integer.parseInt(st.nextToken());		//dong_direction
		dong[1] = Integer.parseInt(st.nextToken());		//dong_distance
//		//동근이 위치
//		if(dong[0]  == 1) {
//			map[0][dong[1]] = 7;
//		}
//		else if(dong[0]  == 2) {
//			map[M][dong[1]] = 7;
//		}
//		else if(dong[0]  == 3) {
//			map[dong[1]][0] = 7;
//		}
//		else if(dong[0]  == 4) {
//			map[dong[1]][N] = 7;
//		}

		int sum = 0;
		int idx = 0;
		int sigye = 0;
		int bansigye = 0;
		//시계방향
		for(int i = 0; i <= M; i++) {
			for(int j = 0; j <= N; j++) {

				if(map[i][j] == 2) {
					
					//dong_direction 이 북쪽이면
					if(dong[0] == 1) {
						if(shop[idx][0] == 1) { //북
							if(shop[idx][1] > dong[1]) {
								sigye = shop[idx][1] - dong[1];
								bansigye = 2*M+2*N - sigye;
								sum += Math.min(sigye, bansigye);	//남 -> 다시 남쪽 시계방향
							}
							else if(shop[idx][1] < dong[1]) {
								sigye = (N-dong[1]) + 2*M + N + shop[idx][1];
								bansigye = 2*M+2*N - sigye;
								sum += Math.min(sigye, bansigye);
							}
						} 
						else if(shop[idx][0] == 2) {	//남
							sigye = N-dong[1] + M + (N-shop[idx][1]);
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye);
						}

						else if(shop[idx][0] == 3) {	//서
							sigye= (N-dong[1]) + M + N + (M-shop[idx][1]);
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye);
						}
						else if(shop[idx][0] == 4) {
							sigye = (N-dong[1]) + shop[idx][1];	
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye);
						}


					}
					
					//dong_direction이 남쪽이면
					if(dong[0] == 2) {
						if(shop[idx][0] == 1) { //북
							sigye = (dong[1]) + (shop[idx][1]) + M;
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye); 	//남 -> 북쪽 시계방향
						} 
						else if(shop[idx][0] == 2) {	//남
							if(shop[idx][1] > dong[1]) {
								sigye = (dong[1]) + 2*M + N + (N-shop[idx][1]);
								bansigye = 2*M+2*N - sigye;
								sum += Math.min(sigye, bansigye);	//남 -> 다시 남쪽 시계방향
							}
							else if(shop[idx][1] < dong[1]) {
								sigye = (dong[1]) - (shop[idx][1]);
								bansigye = 2*M+2*N - sigye;
								sum += Math.min(sigye, bansigye);
							}
						}

						else if(shop[idx][0] == 3) {	//서
							sigye= (dong[1]) + (M-shop[idx][1]);		//남 -> 서쪽 시계방향
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye);
						}
						else if(shop[idx][0] == 4) {
							sigye = (dong[1]) + M + N + shop[idx][1];	//남 -> 동쪽 시계방향	
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye);
						}


					}
					
					
					//dong_direction이 서쪽이면
					if(dong[0] == 3) {
						if(shop[idx][0] == 1) { //북
							sigye = dong[1] + shop[idx][1];
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye); 	
						} 
						else if(shop[idx][0] == 2) {	//남
							sigye = dong[1] + N + M + (N-shop[idx][1]);
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye); 	
						}

						else if(shop[idx][0] == 3) {	//서
							if(shop[idx][1] > dong[1]) {
								sigye = dong[1] + 2*N + M + (M-shop[idx][1]);
								bansigye = 2*M+2*N - sigye;
								sum += Math.min(sigye, bansigye);	
							}
							else if(shop[idx][1] < dong[1]) {
								sigye = dong[1] - shop[idx][1];
								bansigye = 2*M+2*N - sigye;
								sum += Math.min(sigye, bansigye);
							}
						}
						else if(shop[idx][0] == 4) {
							sigye = dong[1] + N + shop[idx][1];	
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye);
						}


					}
					
					//dong_direction이 동쪽이면
					if(dong[0] == 4) {
						if(shop[idx][0] == 1) { //북
							sigye = (M-dong[1]) + N + M + shop[idx][1];
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye); 	
						} 
						else if(shop[idx][0] == 2) {	//남
							sigye = (M-dong[1]) + (N-shop[idx][1]);
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye); 	
						}

						else if(shop[idx][0] == 3) {	//서
							sigye = (M-dong[1]) + N + (M - shop[idx][1]);
							bansigye = 2*M+2*N - sigye;
							sum += Math.min(sigye, bansigye); 
						}
						else if(shop[idx][0] == 4) {
							if(shop[idx][1] > dong[1]) {
								sigye = shop[idx][1] - dong[1];
								bansigye = 2*M+2*N - sigye;
								sum += Math.min(sigye, bansigye);	
							}
							else if(shop[idx][1] < dong[1]) {
								sigye = (M-dong[1]) + 2*N + M + (shop[idx][1]);
								bansigye = 2*M+2*N - sigye;
								sum += Math.min(sigye, bansigye);
							}
						}


					}
					
					
					idx++;
				}
			}
		}


		bw.write(sum+"");
		bw.flush();


		//		for(int i = 0; i <= M; i++) {
		//			for(int j = 0; j <= N; j++) {
		//				bw.write(map[i][j] + " ");
		//			}
		//			bw.write("\n");
		//		}
		//		bw.flush();
	}


}
