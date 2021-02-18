package codeup1;

import java.util.Scanner;

public class Q1288 {
	// 1288 : nCr (Tiny)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int r = s.nextInt();

		System.out.println(factorial(n) / (factorial(n - r) * factorial(r)));

	}

	public static int factorial(int n) {
		if (n <= 1) return 1;
		else return factorial(n - 1) * n;
	}
}
