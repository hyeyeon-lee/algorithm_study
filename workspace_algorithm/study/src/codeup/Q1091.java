package codeup;

import java.util.Scanner;

public class Q1091 {
	// 1091 : [기초-종합] 수 나열하기3
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int m = s.nextInt();
		int d = s.nextInt();
		int n = s.nextInt();

		int i = 1;
		long b = a;
		while (i < n) {
			b = (b * m) + d;
			i++;
		}
		System.out.printf("%d ", b);

	}
}
