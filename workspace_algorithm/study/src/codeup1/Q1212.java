package codeup1;

import java.util.Scanner;

public class Q1212 {
	// 1212 : 삼각형의 성립 조건
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a + b > c && a + c > b && b + c > a)
			System.out.println("yes");
		else
			System.out.println("no");

	}
}
