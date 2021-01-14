package codeup1;

import java.util.Scanner;

public class Q1254 {
	// 1254 : 알파벳 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		char start = s.next().charAt(0);
		char end = s.next().charAt(0);

		for (char alpha = start; alpha <= end; alpha++) {
			System.out.printf("%s ", alpha);
		}

	}
}
