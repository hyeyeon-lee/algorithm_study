package codeup;

import java.util.Scanner;

public class Q1048 {

	// 1048 : [기초-비트시프트연산] 한 번에 2의 거듭제곱 배로 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		//정수 2개가 공백을 두고 입력된다. => 보완
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.printf("%d", a << b);
	}

}
