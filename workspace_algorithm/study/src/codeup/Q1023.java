package codeup;

import java.util.Scanner;

public class Q1023 {
	// 1023 : [기초-입출력] 실수 1개 입력받아 부분별로 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String num = s.nextLine();
		String[] arr = num.split("\\.");

		System.out.printf("%s\n%s", arr[0], arr[1]);
		// comment: float을 사용하는 방법
	}

}
