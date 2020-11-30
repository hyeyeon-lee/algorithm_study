package codeup;

import java.util.Scanner;

public class Q1116 {
	// 1116 : 사칙연산 계산기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("%d+%d=%d\n", a, b, a + b);
		System.out.printf("%d-%d=%d\n", a, b, a - b);
		System.out.printf("%d*%d=%d\n", a, b, a * b);
		System.out.printf("%d/%d=%d", a, b, a / b);

	}
}
