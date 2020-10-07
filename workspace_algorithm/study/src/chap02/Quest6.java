package chap02;

import java.util.Scanner;

public class Quest6 {
	// 배열의 앞쪽에 아랫자리가 아닌 윗자리를 넣도록 메소드 작성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int no; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿수
		int retry; // 다시 시도
		char[] cno = new char[32]; // 변환 후 각 자리 숫자를 넣어두는 배열

		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수: ");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.println("어떤 진수로 변환할까요? (2~36) : ");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(no, cd, cno); // no를 cd진수로 변환

			System.out.println(cd + "진수로는 ");
			for (int i = 0; i < dno; i++) // 윗자리로부터 차례로 나타냄
				System.out.print(cno[i]);
			System.out.println("입니다.");

			System.out.println("한번 더 할까요? (1.예/0.아니오) : ");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}

	// 정숫값 x를 r진수로 변환하여 배열 d에 윗자리부터 넣어두고 자릿수를 반환
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; // 변환 후 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);// r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);

		// 뒤집기
		char temp;
		for (int i = 0; i < digits / 2; i++) {
			temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;

		}
		return digits;
	}

}
