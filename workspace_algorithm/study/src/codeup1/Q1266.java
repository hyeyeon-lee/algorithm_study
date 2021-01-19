package codeup1;

import java.util.Scanner;

public class Q1266 {
	// 1266 : n개의 수의 합
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int sum = 0;

		for (int i = 0; i < num; i++)
			sum += s.nextInt();

		System.out.println(sum);

	}
}
