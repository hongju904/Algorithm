package test;
import java.io.*;
import java.util.*;

public class b11286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> Q = new PriorityQueue<>((o1,o2)->{
			// 정렬 기준
			int abs1 = Math.abs(o1);
			int abs2 = Math.abs(o2);
			
			if (abs1 == abs2) return o1>o2?1:-1;
			return abs1-abs2;
		});
		
		for (int i=0; i<N; i++) {
			int tmp = sc.nextInt();
		
			if (tmp==0) {
				if (Q.isEmpty()) System.out.println(0);
				else System.out.println(Q.poll());
			}else {
				Q.add(tmp);
			}
		}

	}

}
