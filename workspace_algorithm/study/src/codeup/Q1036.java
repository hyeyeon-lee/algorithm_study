package codeup;

import java.util.Scanner;

public class Q1036 {

	// 1036 : [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char num = s.next().charAt(0);
		int ascii = (int) num;
		System.out.printf("%d", ascii);
	}

}
