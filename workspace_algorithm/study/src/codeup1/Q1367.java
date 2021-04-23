package codeup1;

import java.util.Scanner;

public class Q1367 {
	// 1367 : 평행사변형 출력하기 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num - i; j > 1; j--)
				System.out.print(" ");

			for (int j = 0; j < num; j++)
				System.out.print("*");

			System.out.println();
		}

	}

}
