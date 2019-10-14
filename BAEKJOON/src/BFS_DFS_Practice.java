import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BFS_DFS_Practice {

	static int V;
	static int E;
	static int start_V;
	static int[][] map;
	static boolean[] visited;
	
	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start_V = Integer.parseInt(st.nextToken());
		
		map = new int[V+1][V+1];
		visited = new boolean[V+1];
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int temp1 = Integer.parseInt(st.nextToken());
			int temp2 = Integer.parseInt(st.nextToken());
			
			map[temp1][temp2] = 1;
			map[temp2][temp1] = 1;
		}
		
		
	}

}
