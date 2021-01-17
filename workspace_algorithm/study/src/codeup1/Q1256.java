package codeup1;

import java.util.Scanner;

public class Q1256 {
	// 1256 : 별 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 0; i < n; i++)
			System.out.print("*");
	}
}
