package codeup1;

import java.util.Scanner;

public class Q1165 {
	// 1165 : 축구의 신 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int time = s.nextInt();
		int score = s.nextInt();

		while (time < 90) {
			score++;
			time += 5;
		}
		System.out.println(score);

	}
}
