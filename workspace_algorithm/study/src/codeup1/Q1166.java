package codeup1;

import java.util.Scanner;

public class Q1166 {
	// 1166 : 윤년 판별
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int year = s.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.println("yes");
		else
			System.out.println("no");

	}
}
