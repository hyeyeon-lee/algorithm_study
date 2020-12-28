package codeup1;

import java.util.Scanner;

public class Q1171 {
	// 1171 : 당신의 학번은? 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int grd = s.nextInt();
		int clss = s.nextInt();
		int num = s.nextInt();

		System.out.printf("%d%02d%03d", grd, clss, num);

	}
}
