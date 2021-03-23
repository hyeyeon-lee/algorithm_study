package codeup1;

import java.util.Scanner;

public class Q1358 {
	// 1358 : 삼각형 출력하기 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 0; i < num / 2 + 1; i++) {
			for (int j = num / 2; j > i; j--)
				System.out.print(" ");
			for (int j = 0; j <= i + i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
