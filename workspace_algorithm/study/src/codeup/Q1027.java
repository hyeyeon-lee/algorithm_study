package codeup;

import java.util.Scanner;

public class Q1027 {
	// 1027 : [기초-입출력] 년월일 입력 받아 형식 바꿔 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String date = s.next();
		String[] arr = date.split("\\.");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);

		System.out.printf("%02d-%02d-%04d", day, month, year);

	}

}
