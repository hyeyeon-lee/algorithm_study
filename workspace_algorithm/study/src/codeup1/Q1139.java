package codeup1;

import java.util.Scanner;

public class Q1139 {
	// 1139 : 논리 연산자(AND)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		System.out.printf("%d", a == 1 && b == 1 ? 1 : 0);

	}
}
