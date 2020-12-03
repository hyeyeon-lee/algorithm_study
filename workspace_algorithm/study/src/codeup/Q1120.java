package codeup;

import java.util.Scanner;

public class Q1120 {
	// 1120 : 세 수의 평균
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.printf("%.2f", (float) (a + b + c) / 3);

	}
}
