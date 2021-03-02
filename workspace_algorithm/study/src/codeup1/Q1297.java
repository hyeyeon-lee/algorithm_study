package codeup1;

import java.util.Scanner;

public class Q1297 {
	// 1297 : 단면의 최대 넓이
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int max = 0;
		int b = 0;

		for (int i = 1; i <= n / 2; i++) {
			int w = (n - 2 * i) * i;
			if (w > max) {
				max = w;
				b = i;
			}
		}

		System.out.println(b);

	}

}
