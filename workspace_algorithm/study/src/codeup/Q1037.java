package codeup;

import java.util.Scanner;

public class Q1037 {

	// 1037 : [기초-출력변환] 정수 입력받아 아스키 문자로 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		char ascii = (char) num;
		System.out.printf("%s", ascii);
	}

}
