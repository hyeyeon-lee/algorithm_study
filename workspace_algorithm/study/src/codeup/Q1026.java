package codeup;

import java.util.Scanner;

public class Q1026 {
	// 1026 : [기초-입출력] 시분초 입력받아 분만 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String time = s.next();
		System.out.println(Integer.parseInt(time.split(":")[1]));

	}

}
