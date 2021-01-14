package codeup1;

import java.util.Scanner;

public class Q1253 {
	// 1253 : a 부터 b까지 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		for (int i = (a > b ? b : a); i <= (a > b ? a : b); i++)
			System.out.printf("%d ", i);
	}
}
