package codeup1;

import java.util.Scanner;

public class Q1293 {
	// 1293 : 1등과 꼴등
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < num; i++) {
			int score = s.nextInt();
			if (min > score) min = score;
			if (max < score) max = score;
		}

		System.out.printf("%d %d", max, min);

	}

}
