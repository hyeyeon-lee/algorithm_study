package codeup;

import java.util.Scanner;

public class Q1092 {
	// 1092 : [기초-종합] 함께 문제 푸는 날(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int day = 1;
		while (day % a != 0 || day % b != 0 || day % c != 0)
			day++;

		System.out.printf("%d", day);
	}
}
