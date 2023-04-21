package test;
import java.io.*;
import java.util.*;

public class b1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		int now = 1;
		boolean result = true;
		StringBuffer bf = new StringBuffer();
		for (int i=0; i<A.length; i++) {
			int n = A[i];
			if (n >= now) {
				while (n>= now) {
					stack.push(now++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}
			else {
				int tmp = stack.pop();
				if (tmp > n) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
			
		}
		
		if (result) System.out.println(bf.toString());
	}

}
