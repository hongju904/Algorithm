package test;
import java.io.*;
import java.util.*;

public class b1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] num = new int[N+1];
		for (int i=0; i<=N; i++) {
			num[i] = i;
		}
		
		for (int i=2; i<Math.sqrt(N); i++) {
			if (num[i]==0) continue;
			for(int j=i+i; j<N; j=j+i) {
				num[j] = 0;
			}
		}
		
		for(int i=M; i<=N; i++) {
			if (num[i]!=0) {
				System.out.println(num[i]);
			}
		}
	}
}
