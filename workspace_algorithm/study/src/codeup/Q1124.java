package codeup;

import java.util.Scanner;

public class Q1124 {
	// 1124 : 분자량 구하기 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();

		int c = str.indexOf("C");
		int h = str.indexOf("H");

		int num1 = Integer.parseInt(str.substring(c + 1, h));
		int num2 = Integer.parseInt(str.substring(h + 1));

		System.out.printf("%d", num1 * 12 + num2);

	}
}
