package codeup1;

import java.util.Scanner;

public class Q1201 {
	// 1201 : 정수 판별
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		if (num > 0)
			System.out.println("양수");
		else if (num == 0)
			System.out.println("0");
		else
			System.out.println("음수");

	}
}
