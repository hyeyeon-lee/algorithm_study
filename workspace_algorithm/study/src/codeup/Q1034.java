package codeup;

import java.util.Scanner;

public class Q1034 {

	// 1034 : [기초-출력변환] 8진 정수 1개 입력받아 10진수로 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String num = s.next();
		int octal = Integer.valueOf(num, 8);
		System.out.printf("%d", octal);
	}

}
