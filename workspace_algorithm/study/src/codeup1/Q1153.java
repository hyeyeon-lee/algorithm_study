package codeup1;

import java.util.Scanner;

public class Q1153 {
	// 1153 : 두 수의 대소 비교
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else
			System.out.println("=");

	}
}
