package codeup1;

import java.util.Scanner;

public class Q1267 {
	// 1267 : n개의 수 중 5의 배수의 합
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int sum = 0;

		for (int i = 0; i < num; i++) {
			int in = s.nextInt();
			if (in % 5 == 0)
				sum += in;
		}

		System.out.println(sum);

	}
}
