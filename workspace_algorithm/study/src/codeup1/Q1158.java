package codeup1;

import java.util.Scanner;

public class Q1158 {
	// 1158 : 특별한 공 던지기 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if ((a >= 30 && a <= 40) || (a >= 60 && a <= 70))
			System.out.println("win");
		else
			System.out.println("lose");

	}
}
