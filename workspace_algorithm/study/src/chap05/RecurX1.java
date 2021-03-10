package chap05;

import java.util.Scanner;

// 재귀 함수 이해하기
// 꼬리 재귀 제거
public class RecurX1 {

	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		recur(x);

	}

}
