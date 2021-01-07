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

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.printf("%s", isLeap ? "29" : "28");
			break;
		}
	}
}
