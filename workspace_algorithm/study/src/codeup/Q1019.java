package codeup;

import java.util.Scanner;

public class Q1019 {
	// 1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String date = s.nextLine();
		// dot 구분 시 .으로 자르면 안되고 \\. 사용해야 함
		String[] arr = date.split("\\.");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);

		// 두칸 출력, 빈칸 0 채우기
		System.out.printf("%04d.%02d.%02d", year, month, day);
	}

}
