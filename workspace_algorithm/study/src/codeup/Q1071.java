package codeup;

import java.util.Scanner;

public class Q1071 {
	// 1071 : [기초-반복실행구조] 0 입력될 때까지 무한 출력하기1(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (true) {
			int a = s.nextInt();
			if (a == 0)
				break;
			System.out.println(a);
		}
	}

}
