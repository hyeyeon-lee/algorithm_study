package codeup;

import java.util.Scanner;

public class Q1073 {
	// 1073 : [기초-반복실행구조] 0 입력될 때까지 무한 출력하기2(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num;
		do {
			num = s.nextInt();
			if (num == 0)
				break;
			System.out.println(num);
		} while (num != 0);

	}
}
