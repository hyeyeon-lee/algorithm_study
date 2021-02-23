package codeup1;

import java.util.Scanner;

public class Q1294 {
	// 1294 : 시저의 암호 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String plain = s.nextLine();
		for (int i = 0; i < plain.length(); i++) {
			char t = plain.charAt(i);
			if (t != 32) t += 3; // space: 32
			t -= t / 123 * 26; // overflow [a-z]
			System.out.printf("%c", (char) t);
		}
	}

}
