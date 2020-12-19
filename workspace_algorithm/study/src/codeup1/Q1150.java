package codeup1;

import java.util.Scanner;

public class Q1150 {
	// 1150 : 세 수 중 가장 작은 수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int min = Integer.MAX_VALUE;

		if (a > b) { // a > b
			if (b > c) // 1) a > b > c
				min = c;
			else { // c > b > a
					min = b;
			}
		} else { // b > a
			if (a > c) // b > a > c
				min = c;
			else { // b > c > a
					min = a;
			}
		}

		/* 1)
		if (a > b) { // a > b
			if (b > c) // 1) a > b > c
				min = c;
			else { // c > b
				if (a > c) // 2) a > c > b
					min = b;
				else // 3) c > a > b
					min = b;
			}
		} else { // b > a
			if (a > c) // b > a > c
				min = c;
			else { // c > a
				if (b > c) // b > c > a
					min = a;
				else // c > b > a
					min = a;
			}
		}*/

		System.out.printf("%d", min);

	}
}
