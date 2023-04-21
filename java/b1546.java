package test;
import java.io.*;
import java.util.*;

public class b1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		for (int i=0; i<N; i++) {
			score[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		for (int i=0; i<N; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			sum += score[i];
		}
		sum = sum/max*100;
		
		System.out.println(sum/N);

	}

}
