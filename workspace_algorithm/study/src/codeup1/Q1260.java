package codeup1;

import java.util.Scanner;

public class Q1260 {
	// 1260 : 3의 배수의 합
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int start = s.nextInt();
		int end = s.nextInt();
		int sum = 0;

		for (int i = start; i <= end; i++)
			if (i % 3 == 0)
				sum += i;

		System.out.println(sum);
	}
}
