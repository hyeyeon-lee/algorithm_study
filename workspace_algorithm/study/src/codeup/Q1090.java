package codeup;

import java.util.Scanner;

public class Q1090 {
	// 1090 : [기초-종합] 수 나열하기2
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int r = s.nextInt();
		int n = s.nextInt();

		int i = 1;
		double b = a;
		while (i < n) {
			b *= r;
			i++;
		}
		System.out.printf("%.0f ", b);

	}
}
