package codeup1;

import java.util.Scanner;

public class Q1368 {
	// 1368 : 평행사변형 출력하기 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int k = s.nextInt();
		String d = s.next();

		for (int i = 0; i < h; i++) {
			if (d.equals("L")) { // L
				for (int j = 0; j < i; j++)
					System.out.print(" ");

				for (int j = 0; j < k; j++)
					System.out.print("*");

			} else { // R
				for (int j = h - i; j > 1; j--)
					System.out.print(" ");

				for (int j = 0; j < k; j++)
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
