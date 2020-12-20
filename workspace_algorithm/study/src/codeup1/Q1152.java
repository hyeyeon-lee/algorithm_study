package codeup1;

import java.util.Scanner;

public class Q1152 {
	// 1152 : 10보다 작은 수 (else 버전)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if (a < 10)
			System.out.print("small");
		else
			System.out.print("big");

	}
}
