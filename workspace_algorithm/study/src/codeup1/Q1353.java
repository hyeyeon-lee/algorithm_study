package codeup1;

import java.util.Scanner;

public class Q1353 {
	// 1353 : 삼각형 출력하기 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
