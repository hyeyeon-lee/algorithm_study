package codeup;

import java.util.Scanner;

public class Q1077 {
	// 1077 : [기초-반복실행구조] 정수 1개 입력받아 그 수까지 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}
	}
}
