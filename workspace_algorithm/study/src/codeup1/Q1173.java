package codeup1;

import java.util.Scanner;

public class Q1173 {
	// 1173 : 30분전
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int h = s.nextInt();
		int m = s.nextInt();

		if (m < 30) {
			if (h <= 0) {
				h = 24;
			}
			h--;
			m *= -1;
		}
		m -= 30;

		System.out.printf("%d %d", h, Math.abs(m));
	}
}
