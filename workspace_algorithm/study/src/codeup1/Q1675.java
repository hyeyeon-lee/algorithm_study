package codeup1;

import java.util.Scanner;

public class Q1675 {
	// 1675 : 시저의 암호 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String plain = s.nextLine();
		for (int i = 0; i < plain.length(); i++) {
			char t = plain.charAt(i);
			if (t != 32) {
				t -= 3; // space: 32
				if (t / 97 == 0) t += 26; // overflow [a-z]
			}

			System.out.printf("%c", (char) t);
		}

	}

}
