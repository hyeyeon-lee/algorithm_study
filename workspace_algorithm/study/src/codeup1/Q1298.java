package codeup1;

import java.util.Scanner;

public class Q1298 {
	// 1298 : Ax + By = C (Large)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		euclid(a, b);
	}

	static int euclid(int a, int b) {
		System.out.println("a: " + a + " b: " + b);
		if (b > 0) {

			euclid(b, a % b);

			// a == b * a/b + a%b;
			// a%b = a - b * a/b
			// b == a%b * a/b + a%b;
			// a%b = a - b * a/b
			// System.out.println(a - b * a / b);

			return a - b * a / b;
		} else return 0;

	}

}
