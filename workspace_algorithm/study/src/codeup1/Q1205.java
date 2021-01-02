package codeup1;

import java.util.Scanner;

public class Q1205 {
	// 1205 : 최댓값
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		double max = Integer.MIN_VALUE;

		if (a + b > max)
			max = a + b;
		if (b + a > max)
			max = b + a;

		if (a - b > max)
			max = a - b;
		if (b - a > max)
			max = b - a;

		if (a * b > max)
			max = a * b;
		if (b * a > max)
			max = b * a;

		if (a / b > max)
			max = a / b;
		if (b / a > max)
			max = b / a;

		if (Math.pow(a, b) > max)
			max = Math.pow(a, b);
		if (Math.pow(b, a) > max)
			max = Math.pow(b, a);

		System.out.printf("%.6f", max);
	}
}
