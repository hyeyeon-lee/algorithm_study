package codeup;

import java.util.Scanner;

public class Q1095 {
	// 1095 : [기초-1차원배열] 이상한 출석 번호 부르기3(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); // 출석 번호를 부른 횟수

		int i = 0;
		int min = 24;
		while (i < num) {

			int snum = s.nextInt();
			if (min > snum)
				min = snum;

			i++;

		}

		System.out.printf("%d", min);
	}
}
