package chap06;

import java.util.Scanner;

public class BubbleSortCount {
	// 버블 정렬 (버전 1)
	// 비교 과정을 자세히 출력
	// 비교횟수, 교환횟수 출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬 (버전 1)");
		System.out.println("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx); // 버블정렬 시작

		System.out.println();
		System.out.println("오름차순 정렬 완료.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}

	// a[idx1] a[idx2] 자리 바꾸기
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d:\n", i + 1);
			for (int j = 0; j <= n - 1; j++) {
				System.out.printf("%4d", a[j]);
			}
			System.out.println();

			for (int j = n - 1; j > 1; j--) {
				if (a[j - 1] > a[j]) swap(a, j - 1, j);
			}

		}

	}

}
