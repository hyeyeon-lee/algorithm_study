package codeup1;

import java.util.Scanner;

public class Q1271 {
	// 1271 : 최대값 구하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < num; i++) {
			int input = s.nextInt();
			if (input > max)
				max = input;
		}

		System.out.println(max);
	}
}
