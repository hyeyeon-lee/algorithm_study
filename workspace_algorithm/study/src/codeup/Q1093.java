package codeup;

import java.util.Scanner;

public class Q1093 {
	// 1093 : [기초-1차원배열] 이상한 출석 번호 부르기1(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); // 출석 번호를 부른 횟수
		int[] arr = new int[24];

		for (int i = 0; i < num; i++) {
			int sn = s.nextInt(); // 무작위로 부르기
			arr[sn] = arr[sn] + 1;
		}

		for (int i = 1; i < 24; i++) // 0번은 없음!! 1~23
			System.out.printf("%d ", arr[i]);
	}
}
