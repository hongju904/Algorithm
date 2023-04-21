package test;
import java.io.*;
import java.util.*;

public class b11724 {
	static boolean visited[];
	static ArrayList<Integer>[] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		visited = new boolean[N+1];
		graph = new ArrayList[N+1];
		for (int i=1; i<N+1; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			
			graph[node1].add(node2);
			graph[node2].add(node1);
		}
		
		int count = 0;
		for (int i=1; i<N; i++) {
			if (!visited[i]) {
				count ++;
				DFS(i);
			}
		}
		System.out.println(count);

	}
	
	private static void DFS(int start) {
		if(visited[start]) {
			return;
		}
		visited[start] = true;
		
		for (int i: graph[start]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}

}
