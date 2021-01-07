package codeup1;

import java.util.Scanner;

public class Q1214 {
	// 1214 : 이 달은 며칠까지 있을까?
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int year = s.nextInt();
		int month = s.nextInt();

		boolean isLeap = false;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			isLeap = true;
		}

		if (month == 2) {
			if (isLeap)
				System.out.println("29");
			else
				System.out.println("28");
		} else if (month == 4 || month == 6 || month == 9 || month == 11)
			System.out.println("30");
		else
			System.out.println("31");

	}
}
