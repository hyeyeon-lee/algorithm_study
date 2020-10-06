package codeup;

import java.util.Scanner;

public class Q1047 {

	// 1047 : [기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		System.out.printf("%d", num << 1);
	}

}
