package codeup;

import java.util.Scanner;

public class Q1076 {
	// 1076 : [기초-반복실행구조] 문자 1개 입력받아 알파벳 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char a = 'a';
		char x = s.next().charAt(0);

		do {
			System.out.print(a+" ");
		} while (a++ < x);

	}
}
