package test;
import java.io.*;
import java.util.*;

public class b1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		String[] str = line.split("-");
		int result = 0;
		
		for (int i=0; i<str.length; i++) {
			int tmp = mySum(str[i]);
			if (i==0) result = tmp;
			else result -= tmp;
		}
		System.out.println(result);

	}

	static private int mySum(String s) {
		int sum = 0;
		String[] tmp = s.split("[+]");
		for (int i=0; i<tmp.length; i++) {
			sum += Integer.parseInt(tmp[i]);
		}
		
		return sum;
	}
}
