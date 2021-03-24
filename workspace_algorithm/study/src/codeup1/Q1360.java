package codeup1;

import java.util.Scanner;

public class Q1360 {
	// 1360 : 숫자 피라미드 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.printf("%d ", i);
			System.out.println();
		}

	}

}
