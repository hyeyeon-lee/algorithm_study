package codeup1;

import java.util.Scanner;

public class Q1224 {
	// 1224 : 분수 크기 비교
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float a = s.nextFloat();
		float b = s.nextFloat();
		float c = s.nextFloat();
		float d = s.nextFloat();

		if (a / b > c / d)
			System.out.println(">");
		else if (a / b < c / d)
			System.out.println("<");
		else
			System.out.println("=");
	}
}
