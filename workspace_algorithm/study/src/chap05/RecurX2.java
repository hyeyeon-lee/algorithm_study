package chap05;

import java.util.Scanner;

import chap04.IntStack;

// 재귀 함수 이해하기
// 꼬리 재귀 제거
// 스택을 이용
public class RecurX2 {

	static void recur(int n) {
		IntStack s = new IntStack(n);

		while (true) {
			if (n > 0) {
				s.push(n); // n 푸시
				n = n - 1;
				continue;

			}
			if (s.isEmpty() != true) { // 빈 스택이 아니라면
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
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
