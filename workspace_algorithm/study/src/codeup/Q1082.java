package codeup;

import java.util.Scanner;

public class Q1082 {
	// 1082 : [기초-종합] 16진수 구구단?
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String n = s.next();
		int hex = Integer.valueOf(n, 16);
		int last = Integer.valueOf("F", 16);

		for (int i = 1; i <= last; i++)
			System.out.printf("%X*%X=%X\n", hex, i, hex * i);

	}
}
