package codeup1;

import java.util.Scanner;

public class Q1915 {
	// 1915 : (재귀함수) 피보나치 수열
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		System.out.println(fibonacci(num));

		s.close();

	}

	public static int fibonacci(int n) {
		if (n > 2) return fibonacci(n - 2) + fibonacci(n - 1);
		else return 1;
	}
}
