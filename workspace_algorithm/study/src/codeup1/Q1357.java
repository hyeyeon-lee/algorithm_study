package codeup1;

import java.util.Scanner;

public class Q1357 {
	// 1357 : 삼각형 출력하기 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num; i > 1; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
