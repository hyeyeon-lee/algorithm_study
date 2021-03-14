package codeup1;

import java.util.Scanner;

public class Q1355 {
	// 1355 : 삼각형 출력하기 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++)
				System.out.print(" ");
			for (int j = n; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}

	}

}
