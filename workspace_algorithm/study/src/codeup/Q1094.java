package codeup;

import java.util.Scanner;

public class Q1094 {
	// 1094 : [기초-1차원배열] 이상한 출석 번호 부르기2(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); // 출석 번호를 부른 횟수
		int[] arr = new int[num];

		for (int i = 0; i < num; i++)
			arr[i] = s.nextInt(); // 무작위로 부르기

		for (int i = num - 1; i >= 0; i--) // 거꾸로 출력하기
			System.out.printf("%d ", arr[i]);
	}
}
