package chap02;

import java.util.Scanner;

public class Quest2 {
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

		reverse(x);
		print(x);
		System.out.println("역순 정렬을 마쳤습니다.");
	}

	// 바꾸기
	static void swap(int[] a, int idx1, int idx2) {
		System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]을 교환합니다.");
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 뒤집기
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			print(a);
			swap(a, i, a.length - i - 1);
		}

	}

	// 배열 요소 출력
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
