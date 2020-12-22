package codeup1;

import java.util.Scanner;

public class Q1157 {
	// 1157 : 특별한 공 던지기 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float a = s.nextFloat();

		if (a >= 50 && a <= 60)
			System.out.println("win");
		else
			System.out.println("lose");

	}
}
