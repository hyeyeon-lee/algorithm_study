package codeup;

import java.util.Scanner;

public class Q1028 {

	// 1028 : [기초-데이터형] 정수 1개 입력받아 그대로 출력하기2(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String num = s.next();
		// 없었는데 생겼다는 java의 unsigned int 사용
		System.out.println(Integer.toUnsignedString(Integer.parseUnsignedInt(num)));
	}

}
