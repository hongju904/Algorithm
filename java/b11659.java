package test;
import java.io.*;
import java.util.*;

public class b11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		long[] number = new long[N+1];
		number[0] = 0;
		
		for (int i=1; i<N+1; i++) {
			number[i] = Integer.parseInt(st.nextToken()) + number[i-1];}
		
		for (int i=0; i<M; i++) {
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			System.out.println(number[end]-number[start-1]);
		}
	}

}
