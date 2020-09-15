package chap01;

import java.util.Scanner;

public class Digits {
	// 2자리 양수(10~99) 입력
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int no;
		System.out.println("2자리의 정수를 입력하세요");

		do {
			System.out.println("입력 : ");
			no = s.nextInt();
		} while (no < 10 || no > 99);

		System.out.println("변수 no의 값은 " + no + "가 되었습니다.");
	}

}
