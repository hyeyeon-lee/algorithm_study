package codeup1;

import java.util.Scanner;

public class Q1140 {
	// 1140 : 논리 연산자(OR)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		System.out.printf("%d", a == 1 || b == 1 ? 1 : 0);

	}
}
