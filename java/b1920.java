package test;
import java.io.*;
import java.util.*;

public class b1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			M[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(M);
		
		int needN = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<needN; i++) {
			int Mi = Integer.parseInt(st.nextToken());
			boolean find = false;
			int start = 0;
			int end = M.length -1;
			
			while (start <= end) {
				int mid = (start + end) / 2;
				int midNum = M[mid];
				if (midNum < Mi) {
					start = mid+1;
				}
				else if (midNum > Mi) {
					end = mid-1;
				}
				else {
					find = true;
					break;
				}
			}
			if (find) System.out.println(1);
			else System.out.println(0);
			
		}

	}

}
