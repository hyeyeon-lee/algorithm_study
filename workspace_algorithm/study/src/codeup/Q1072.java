package codeup;

import java.util.Scanner;

public class Q1072 {
	// 1072 : [기초-반복실행구조] 정수 입력받아 계속 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();

		while (count > 0) {
			int num = s.nextInt();
			System.out.println(num);
			count--;
		}
	}
}
