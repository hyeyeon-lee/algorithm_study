package codeup1;

import java.util.Scanner;

public class Q1365 {
	// 1365 : 사각형 출력하기 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print("*");
			for (int j = 1; j < num; j++) {
				System.out.printf("%s", j == i || j == num - 1 || i == num - 1 || i == 0 || j == num - i - 1 ? "*" : " ");
			}
			System.out.println();
		}

	}

}
