package codeup1;

import java.util.Scanner;

public class Q1156 {
	// 1156 : 홀수 짝수 구별
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if (a % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}
}
