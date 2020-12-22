package codeup1;

import java.util.Scanner;

public class Q1159 {
	// 1159 : 특별한 공 던지기 3
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if ((a >= 50 && a <= 70) || (a % 6 == 0))
			System.out.println("win");
		else
			System.out.println("lose");

	}
}
