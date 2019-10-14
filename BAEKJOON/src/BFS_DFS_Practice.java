import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_DFS_Practice {

	static int V;
	static int E;
	static int start_V;
	static int[][] map;
	static boolean[] visited;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException  {
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

		//DFS
		visited[start_V] = true;
		DFS(start_V);
		bw.write("\n");
		bw.flush();

		//BFS
		Arrays.fill(visited, false);
		visited[start_V] = true;
		BFS(start_V);

	}

	private static void BFS(int x) throws IOException {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.add(x);
		bw.write(x + " ");

		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for(int i = 1; i <= V; i++) {
				if(visited[i] == false && map[temp][i] == 1) {
					visited[i] = true;
					queue.add(i);
					bw.write(i + " ");
				}
			}
		}
		bw.flush();
	}

	private static void DFS(int x) throws IOException {
		// TODO Auto-generated method stub
		bw.write(x + " ");
		bw.flush();

		for(int i = 1; i <= V; i++) {
			if(visited[i] == false && map[x][i] == 1) {
				visited[i] = true;
				DFS(i);
			}
		}
	}



}
