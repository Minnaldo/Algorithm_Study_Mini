import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 종이자르기 {

	static int N;
	static int M;
	static int K;
	static int result;
	
	static int[][] map;
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		LinkedList<Integer> garo = new LinkedList<Integer>();
		LinkedList<Integer> sero = new LinkedList<Integer>();
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		garo.add(0);
		sero.add(0);
		
		K = Integer.parseInt(br.readLine());
		for(int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int temp1 = Integer.parseInt(st.nextToken());
			int temp2 = Integer.parseInt(st.nextToken());
			
			if(temp1 == 0)
				garo.add(temp2);
			else
				sero.add(temp2);
		}
		
		garo.add(M);
		sero.add(N);
		
		Collections.sort(garo);
		Collections.sort(sero);
		
		
		
//		bw.write("가로"+garo+"");
//		bw.write("\n");
//		bw.write("세로"+sero+"");
//		
//		bw.flush();
		
		int garo_max = 0;
		for(int i = 1; i < garo.size(); i++) {
			garo_max = Math.max(garo.get(i) - garo.get(i-1), garo_max);
		}
		
		int sero_max = 0;
		for(int i = 1; i < sero.size(); i++) {
			sero_max = Math.max(sero.get(i) - sero.get(i-1), sero_max);
		}
		
//		bw.write("garo_max :"+garo_max +"\n");
//		bw.write("sero_max :"+sero_max +"\n");
		
		result = garo_max * sero_max;
		bw.write(result+"");
		bw.flush();
	}

}

/*
10 8
3
0 3
1 4
0 2
*/
/*
50 50
4
0 45
0 30
0 29
0 48
*/