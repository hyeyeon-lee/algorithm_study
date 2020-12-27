package codeup1;

import java.util.Scanner;

public class Q1170 {
	// 1170 : 당신의 학번은? 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int grd = s.nextInt();
		int clss = s.nextInt();
		int num = s.nextInt();

		System.out.printf("%d%d%02d", grd, clss, num);

	}
}
