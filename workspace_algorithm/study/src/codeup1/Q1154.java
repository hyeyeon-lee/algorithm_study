package codeup1;

import java.util.Scanner;

public class Q1154 {
	// 1154 : 큰수 - 작은수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		if (a >= b)
			System.out.printf("%d", a - b);
		else
			System.out.printf("%d", b - a);

	}
}
