package codeup;

import java.util.Scanner;

public class Q1025 {
	// 1025 : [기초-입출력] 정수 1개 입력받아 나누어 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = { 10000, 1000, 100, 10, 1 };

		int mok = 0;

		int num = s.nextInt();

		for (int a : arr) {
			if (num >= a) {
				mok = num / a;
				num = num % a;
				System.out.printf("[%d]", mok * a);
				System.out.println();
			}
		}
	}

}
