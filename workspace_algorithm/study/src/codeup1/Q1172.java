package codeup1;

import java.util.Scanner;

public class Q1172 {
	// 1172 : 세 수 정렬하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a >= b) { // a >= b
			if (b >= c) { // a >= b >= c
				System.out.printf("%d %d %d", c, b, a);
			} else { // c > b
				if (a >= c) { // a >= c > b
					System.out.printf("%d %d %d", b, c, a);
				} else { // c > a > b
					System.out.printf("%d %d %d", b, a, c);
				}

			}
		} else { // b > a
			if (a >= c) { // b > a >= c
				System.out.printf("%d %d %d", c, a, b);
			} else { // c > a
				if (b >= c) { // b >= c > a
					System.out.printf("%d %d %d", a, c, b);
				} else { // c > b > a
					System.out.printf("%d %d %d", a, b, c);
				}

			}
		}

	}
}
