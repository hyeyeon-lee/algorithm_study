package codeup;

import java.util.Scanner;

public class Q1024 {
	// 1024 : [기초-입출력] 단어 1개 입력받아 나누어 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String num = s.nextLine();
		String[] arr = num.split("");

		for (String a : arr) {
			System.out.println("'" + a + "'");
		}

	}

}
