package codeup;

import java.util.Scanner;

public class Q1125 {
	// 1125 : 8진수 16진수 변환
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		System.out.printf("%o ", num);
		System.out.printf("%X", num);

	}
}
