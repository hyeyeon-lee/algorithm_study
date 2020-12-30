package codeup1;

import java.util.Scanner;

public class Q1174 {
	// 1174 : 30분전 (if는 아직...)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int h = s.nextInt();
		int m = s.nextInt();

		int time = 0;
		time = h * 60 + m;
		time -= 30;
		time += 24 * 60;
		time %= (24 * 60);
		h = time / 60;
		m = time % 60;

		System.out.printf("%d %d", h, m);

	}
}
