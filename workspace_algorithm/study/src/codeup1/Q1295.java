package codeup1;

import java.util.Scanner;

public class Q1295 {
	// 1295 : 알파벳 대소문자 변환
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String plain = s.nextLine();
		for (int i = 0; i < plain.length(); i++) {
			char t = plain.charAt(i);
			if (t >= 65 && t <= 90) t += 32; // A-Z
			else if (t >= 97 && t <= 122) t -= 32; // a-z
			System.out.printf("%c", (char) t);
		}

	}

}
