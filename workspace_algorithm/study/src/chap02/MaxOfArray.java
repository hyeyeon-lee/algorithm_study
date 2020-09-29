package chap02;

import java.util.Scanner;

public class MaxOfArray {
	// 배열 요소의 최댓값을 나타냄(값 입력 받음)

	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수 : ");

		int num = stdIn.nextInt(); // 요소수 입력

		int[] height = new int[num]; // 배열 생성

		for (int i = 0; i < num; i++) {

			System.out.println("height[" + i + "]");
			height[i] = stdIn.nextInt();
		}
		System.out.println("최댓값은 " + maxOf(height) + " 입니다.");

	}

}
