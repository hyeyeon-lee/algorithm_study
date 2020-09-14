package backjoon;

import java.util.Scanner;

public class Q2753 {

	// 윤년
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int isLeapYear = 0;

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			isLeapYear = 1;
		}
		System.out.println(isLeapYear);
	}

}
