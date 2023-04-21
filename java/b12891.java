package test;
import java.io.*;
import java.util.*;


public class b12891 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		char DNA[] = new char[S];
		DNA = br.readLine().toCharArray();
		int need[] = new int[4];
		int checkSecret = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			need[i] = Integer.parseInt(st.nextToken());
			if (need[i] == 0) checkSecret++;
		}
		
		int start = 0;
		int end = P-1;
		int A = 0;
		int C = 0;
		int G = 0;
		int T = 0;
		
		for (int i=0;i<P;i++) {
			if (DNA[i] == 'A') A++;
			else if (DNA[i] == 'C') C++;
			else if (DNA[i] == 'G') G++;
			else T++;
		}
		
		int count = 0;
		while (end != S) {
			if (need[0]<=A & need[1]<=C & need[2]<=G & need[3]<=T) count++;
			
			if (DNA[start] == 'A') A--;
			else if (DNA[start] == 'C') C--;
			else if (DNA[start] == 'G') G--;
			else T++;
			
			start ++;
			
			if (end == S-1) break;
			end ++;
			
			if (DNA[end] == 'A') A++;
			else if (DNA[end] == 'C') C++;
			else if (DNA[end] == 'G') G++;
			else T++;
		}
		
		System.out.println(count);
	}
	
	private static void Add(char c) {
		switch(c) {
		case 'A':
			
		}
	}

}
