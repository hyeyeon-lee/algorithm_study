package codeup;

import java.util.Scanner;

public class Q1089 {
	// 1089 : [기초-종합] 수 나열하기1
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int d = s.nextInt();
		int n = s.nextInt();

		int i = 1;
		int b = a;
		while (i < n) {
			b += d;
			i++;
		}
		System.out.printf("%d ", b);

	}
}
