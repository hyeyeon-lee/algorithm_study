package codeup1;

import java.util.Scanner;

public class Q1286 {
	// 1286 : 최댓값, 최솟값
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++) {
			int num = s.nextInt();
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}

		System.out.println(max);
		System.out.println(min);
	}

}
