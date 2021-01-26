package codeup1;

import java.util.Scanner;

public class Q1279 {
	// 1279 : 홀수는 더하고 짝수는 빼고 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		int sum = 0;

		for (int i = a; i <= b; i++) {
			if (i % 2 == 0)
				sum -= i;
			else
				sum += i;
		}

		System.out.println(sum);

	}

}
