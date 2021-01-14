package codeup1;

import java.util.Scanner;

public class Q1231 {
	// 1231 : 계산기 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String op = s.next();

		String regexp = "[+,\\-,/,*]"; // 연산 종류
		String arr[] = op.split(regexp); // 연산 제외 ex) 10+10 -> 10, 10

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);

		String notReg = "[^+,\\-,/,*]"; // 연산 종류 (not)
		String cal = op.replaceAll(notReg, ""); // 숫자 제외

		switch (cal) {
		case "+":
			System.out.printf("%d", a + b);
			break;
		case "-":
			System.out.printf("%d", a - b);
			break;
		case "*":
			System.out.printf("%d", a * b);
			break;
		case "/":
			System.out.printf("%.2f", (float) a / b);
			break;

		}

	}
}
