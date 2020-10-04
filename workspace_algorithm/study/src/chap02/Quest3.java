package chap02;

import java.util.Scanner;

public class Quest3 {
	// 배열 요소를 역순 정렬 과정 하나하나 표현
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요소 개수: ");
		int num = stdIn.nextInt();

		int[] x = new int[num];

		// 입력 받기
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}

		System.out.println("배열 요소의 합은 " + sumOf(x) + " 입니다.");

	}

	// 배열 요소 합계
	static int sumOf(int[] a) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;

	}
}
