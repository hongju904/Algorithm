package test;
import java.io.*;
import java.util.*;

public class b1940 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 재료 개수
		int M = Integer.parseInt(br.readLine()); // 고유번호의 합
		int[] A = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		int start = 0;
		int end = N-1;
		int sum = 0;
		int count = 0;
		while (start < end) {
			sum = A[start] + A[end];
			if (sum < M) start ++;
			else if (sum > M) end --;
			else {
				count ++;
				start ++;
				end --;
			}
		}
		System.out.println(count);
		
	}

	
}
