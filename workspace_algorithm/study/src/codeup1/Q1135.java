package codeup1;

import java.util.Scanner;

public class Q1135 {
	// 1135 : 관계연산자 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("%d", a >= b ? 1 : 0);

	}
}
