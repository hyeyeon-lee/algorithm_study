package codeup;

import java.util.Scanner;

public class Q1041 {

	// 1041 : [기초-산술연산] 문자 1개 입력받아 다음 문자 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char str = s.next().charAt(0);
		char nextStr = (char) (str + 1);

		System.out.printf("%s", nextStr);
	}

}
