package AD_보충;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 치킨배달_HONG_SOL {

	static class Point {
		int x = 0, y = 0;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static Point[] chicken;
	static Point[] house;
	static Point[] selChicken;

	static int N;
	static int M;

	static int hCnt = 0;	//집의 수
	static int cCnt = 0;	//치킨집의 수

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		house = new Point[2 * N];

		M = Integer.parseInt(st.nextToken());
		chicken = new Point[13];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				int n = Integer.parseInt(st.nextToken());
				if( n == 1 ) {
					house[hCnt++] = new Point(i, j);
				}
				else if(n == 2) {
					chicken[cCnt++] = new Point(i, j);
				}
			}
		}

		selChicken = new Point[M];
		combination(0, 0);
		System.out.println(ans);

	}

	static int getDist(Point p1, Point p2) {
		return Math.abs(p1.x-p2.x)+ Math.abs(p1.y-p2.y);
	}

	static int dist = 0;
	static int ans = Integer.MAX_VALUE;
	static void combination(int n, int c) {
		if( c == M ) {
			int tmp = 0;
			//모든 집에 대해서
			for(int i = 0; i < hCnt; i++) {
				//	모든 치킨집에 대해서
				for(int j = 0; j < M; j++) {
					//		가장 가까운 거리 하나를 찾자.
					dist = Math.min(dist,  getDist(house[i], selChicken[j]));
				}
				tmp += dist;		//도시 치킨 거리
			}
			ans = Math.min(ans, tmp);
			return;
		}
		if ( n == cCnt )
			return;

		selChicken[c] = chicken[n];
		combination(n+1, c+1);
		combination(n+1, c);
	}
}
