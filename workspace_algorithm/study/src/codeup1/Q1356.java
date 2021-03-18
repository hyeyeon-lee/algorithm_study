package codeup1;

import java.util.Scanner;

public class Q1356 {
	// 1356 : 사각형 출력하기 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i % (num - 1) == 0) System.out.print("*");
				else if (j % (num - 1) == 0) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
