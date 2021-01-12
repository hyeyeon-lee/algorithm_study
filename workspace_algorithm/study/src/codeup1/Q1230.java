package codeup1;

import java.util.Scanner;

public class Q1230 {
	// 1230 : 터널 통과하기 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		String pass = "PASS";
		if (a <= 170) {
			pass = "CRASH";
			System.out.printf("%s %d", pass, a);
		} else if (b <= 170) {
			pass = "CRASH";
			System.out.printf("%s %d", pass, b);
		} else if (c <= 170) {
			pass = "CRASH";
			System.out.printf("%s %d", pass, c);
		} else
			System.out.printf("%s", pass);
	}
}
