package codeup1;

import java.util.Scanner;

public class Q1169 {
	// 1169 : 나이 계산 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		final int standYear = 2012;

		int age = s.nextInt();

		int year = standYear - age + 1;

		if (year < 2000) {
			System.out.printf("%d ", year - 1900);
			System.out.println("1");
		} else {
			System.out.printf("%d ", year - 2000);
			System.out.println("3");
		}

	}
}
