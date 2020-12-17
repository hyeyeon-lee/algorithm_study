package codeup1;

import java.util.Scanner;

public class Q1137 {
	// 1137 : 관계연산자 3
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("%d", a != b ? 1 : 0);

	}
}
