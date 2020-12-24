package codeup1;

import java.util.Scanner;

public class Q1167 {
	// 1167 : 두 번째로 작은 수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a > b) { // a > b
			if (b > c) // a > b > c
				System.out.println(b);
			else { // c > b
				if (a > c) // a > c > b
					System.out.println(c);
				else // c > a > b
					System.out.println(a);
			}
		} else { // b > a

			if (a > c) // b > a > c
				System.out.println(a);
			else // c > a
			if (b > c) // b > c > a
				System.out.println(c);
			else // c > b > a
				System.out.println(b);
		}

	}
}
