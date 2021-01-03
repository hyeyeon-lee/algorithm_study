package codeup1;

import java.util.Scanner;

public class Q1206 {
	// 1206 : 배수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		if (a >= b) {
			if (a % b == 0)
				System.out.printf("%d*%d=%d", b, a / b, a);
			else
				System.out.println("none");
		} else {
			if (b % a == 0)
				System.out.printf("%d*%d=%d", a, b / a, b);
			else
				System.out.println("none");
		}

	}
}
