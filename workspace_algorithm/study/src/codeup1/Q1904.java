package codeup1;

import java.util.Scanner;

public class Q1904 {
	// 1904 : (재귀함수) 두 수 사이의 홀수 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		printOdd(a, b);

		s.close();

	}

	public static void printOdd(int from, int to) {
		if (from % 2 == 1) System.out.printf("%d ", from);
		if (from < to) printOdd(from + 1, to);
	}
}
