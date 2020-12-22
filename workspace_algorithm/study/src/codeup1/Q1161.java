package codeup1;

import java.util.Scanner;

public class Q1161 {
	// 1161 : 홀수와 짝수 그리고 더하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		System.out.printf("%s+", a % 2 == 0 ? "짝수" : "홀수");
		System.out.printf("%s=", b % 2 == 0 ? "짝수" : "홀수");
		System.out.printf("%s", (a + b) % 2 == 0 ? "짝수" : "홀수");

	}
}
