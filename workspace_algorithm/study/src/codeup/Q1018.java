package codeup;

import java.util.Scanner;

public class Q1018 {
	// 1018 : [기초-입출력] 시간 입력받아 그대로 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String time = s.nextLine();
		String[] arr = time.split(":");

		System.out.printf("%s:%s", arr[0], arr[1]);
	}

}
