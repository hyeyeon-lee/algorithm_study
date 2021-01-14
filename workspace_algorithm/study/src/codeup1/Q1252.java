package codeup1;

import java.util.Scanner;

public class Q1252 {
	// 1252 : 1 부터 n 까지 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i <= n; i++)
			System.out.printf("%d ", i);
	}
}
