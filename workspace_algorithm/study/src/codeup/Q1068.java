package codeup;

import java.util.Scanner;

public class Q1068 {

	// 1068 : [기초-조건/선택실행구조] 정수 1개 입력받아 평가 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int score = s.nextInt();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 70) {
			System.out.println("B");
		} else if (score >= 40) {
			System.out.println("C");
		} else if (score >= 0) {
			System.out.println("D");
		}

	}

}
