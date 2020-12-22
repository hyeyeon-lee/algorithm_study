package codeup1;

import java.util.Scanner;

public class Q1155 {
	// 1155 : 7의 배수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if (a % 7 == 0)
			System.out.println("multiple");
		else
			System.out.println("not multiple");

	}
}
