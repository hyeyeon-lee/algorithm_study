package codeup;

import java.util.Scanner;

public class Q1118 {
	// 1118 : 삼각형의 넓이 구하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("%.1f", (float) a * b / 2);

	}
}
