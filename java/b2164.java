package test;
import java.io.*;
import java.util.*;

public class b2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> Q = new LinkedList<>();
		
		for (int i=1; i<=N; i++) {
			Q.add(i);
		}
		
		while (Q.size()>1) {
			Q.poll();
			Q.add(Q.poll());
		}
		
		System.out.println(Q.poll());

	}

}
