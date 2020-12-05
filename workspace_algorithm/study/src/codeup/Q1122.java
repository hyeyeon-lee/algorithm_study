package codeup;

import java.util.Scanner;

public class Q1122 {
	// 1122 : 초를 분/초로 변환
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int sec = s.nextInt();

		final int MIN = 60;
		System.out.printf("%d %d", sec / MIN, sec % MIN);

	}
}
