package codeup1;

import java.util.Scanner;

public class Q1410 {
	// 1410 : 올바른 괄호 1 (괄호 개수 세기)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int op = 0;
		int cl = 0;

		String[] txt = s.next().split("");

		for (String t : txt) {
			if (t.equals("(")) op++;
			if (t.equals(")")) cl++;
		}
		System.out.printf("%d %d", op, cl);

	}
}
