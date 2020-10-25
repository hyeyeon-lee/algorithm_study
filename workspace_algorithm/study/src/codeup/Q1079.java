package codeup;

import java.util.Scanner;

public class Q1079 {
	// 1079 : [기초-종합] 원하는 문자가 입력될 때까지 반복 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a;

		do {
			a = s.next();
			System.out.println(a);
		} while(!a.equals("q"));


	}
}
