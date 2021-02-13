package codeup1;

import java.util.Scanner;

public class Q1289 {
	// 1289 : 가장 큰 운동장
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 3; i++) {
			int w = s.nextInt();
			int h = s.nextInt();
			if (max < w * h)
				max = w * h;
		}

		System.out.println(max);

	}

}
