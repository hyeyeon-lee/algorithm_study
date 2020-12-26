package codeup1;

import java.util.Scanner;

public class Q1168 {
	// 1168 : 나이 계산 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		final int standYear = 2012;

		String b = s.next();
		int g = s.nextInt();

		int year = Integer.parseInt(b.substring(0, 2));

		if (g == 1 || g == 2) {
			year += 1900;
		} else {
			year += 2000;
		}

		int age = standYear - year + 1;
		System.out.println(age);

	}
}
