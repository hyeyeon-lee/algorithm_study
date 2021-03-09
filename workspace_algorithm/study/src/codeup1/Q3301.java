package codeup1;

import java.util.Scanner;

public class Q3301 {
	// 3301 : 거스름돈
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int n = s.nextInt();
		int r = 0;

		for(int i : arr) {
			r += n / i;
			n %= i;
		}

		/*
		r += n / 50000;
		n %= 50000;

		r += n / 10000;
		n %= 10000;

		r += n / 5000;
		n %= 10000;
		.
		.
		.
		*/
		System.out.println(r);

	}

}
