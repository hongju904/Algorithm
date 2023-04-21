package test;
import java.io.*;
import java.util.*;

public class b11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc. nextInt();
		int count = 0;
		int money[] = new int[N];
		for (int i=0; i<N; i++) {
			money[i] = sc.nextInt();
		}

		for (int i=N-1; i>=0; i--) {
			if (K==0) break;
			if (K>=money[i]) {
				count += K/money[i];
				K = K%money[i];
			}
		}
		System.out.println(count);
	}

}
