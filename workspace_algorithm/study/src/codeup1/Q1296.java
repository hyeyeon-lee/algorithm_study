package codeup1;

import java.util.Scanner;

public class Q1296 {
	// 1296 : 직사각형의 최대 넓이
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		float result = (float) n / 4;
		result *= result;

		System.out.printf("%d", (int) result);

	}

}
