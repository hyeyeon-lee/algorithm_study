package codeup1;

import java.util.Scanner;

public class Q1361 {
	// 1361 : 별 계단 만들기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			System.out.println("**");
		}

	}

}
