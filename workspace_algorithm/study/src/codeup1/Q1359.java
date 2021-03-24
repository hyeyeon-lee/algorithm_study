package codeup1;

import java.util.Scanner;

public class Q1359 {
	// 1359 : 숫자 피라미드 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++)
				System.out.printf("%d ", j);
			System.out.println();
		}

	}

}
