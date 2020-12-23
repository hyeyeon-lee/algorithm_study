package codeup1;

import java.util.Scanner;

public class Q1164 {
	// 1164 : 터널 통과하기 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t1 = s.nextInt();
		int t2 = s.nextInt();
		int t3 = s.nextInt();

		if (t1 <= 170 || t2 <= 170 || t3 <= 170)
			System.out.println("CRASH");
		else
			System.out.println("PASS");

	}
}
