package codeup1;

import java.util.Scanner;

public class Q1352 {
	// 1352 : 사각형 출력하기 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
