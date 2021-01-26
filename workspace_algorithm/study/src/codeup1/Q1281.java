package codeup1;

import java.util.Scanner;

public class Q1281 {
	// 1281 : 홀수는 더하고 짝수는 빼고 3
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
				if (i == a)
					System.out.printf("%d", i);
				else
					System.out.printf("+%d", i);
			}
		}

		System.out.printf("=%d", sum);

	}

}
