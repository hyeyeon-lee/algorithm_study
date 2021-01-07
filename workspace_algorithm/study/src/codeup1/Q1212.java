package codeup1;

import java.util.Scanner;

public class Q1212 {
	// 1212 : 삼각형의 성립 조건
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int l = 0;

		if (a > b) {
			if (b > c)
				l = a;
			else {
				if (a > c)
					l = a;
				else
					l = c;
			}
		} else {
			if (a > c)
				l = b;
			else {
				if (b > c)
					l = b;
				else
					l = c;
			}

		}

		if (a + b + c - l > l)
			System.out.println("yes");
		else
			System.out.println("no");

	}
}
