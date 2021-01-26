package codeup1;

import java.util.Scanner;

public class Q1280 {
	// 1280 : 홀수는 더하고 짝수는 빼고 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		int sum = 0;

		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				sum -= i;
				System.out.printf("-%d", i);
			} else {
				sum += i;
				System.out.printf("+%d", i);
			}
		}

		System.out.printf("=%d", sum);

	}

}
