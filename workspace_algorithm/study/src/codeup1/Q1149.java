package codeup1;

import java.util.Scanner;

public class Q1149 {
	// 1149 : 두 수 중 큰 수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		System.out.printf("%d", a > b ? a : b);

	}
}
