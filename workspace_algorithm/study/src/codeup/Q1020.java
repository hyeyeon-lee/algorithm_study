package codeup;

import java.util.Scanner;

public class Q1020 {
	// 1020 : [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String num = s.nextLine();
		String newNum = num.replace("-", "");

		System.out.println(newNum);
	}

}
