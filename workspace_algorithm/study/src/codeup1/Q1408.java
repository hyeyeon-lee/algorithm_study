package codeup1;

import java.util.Scanner;

public class Q1408 {
	// 1408 : 암호 처리
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String pln = s.next();
		String[] plnArr = pln.split("");

		// 1번 암호화 ASCII + 2
		for (String p : plnArr) {
			char cp = p.charAt(0);
			System.out.printf("%c", (int) cp + 2);
		}

		System.out.println();

		// 2번 암호화 ( ASCII * 7 ) % 80 + 48
		for (String p : plnArr) {
			char cp = p.charAt(0);
			System.out.printf("%c", (int) (cp * 7) % 80 + 48);
		}

	}
}
