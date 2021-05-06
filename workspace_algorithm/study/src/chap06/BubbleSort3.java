package chap06;

import java.util.Scanner;

public class BubbleSort3 {
	// 버블 정렬 (버전 3)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬 (버전 2)");
		System.out.println("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx); // 버블정렬 시작

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
		int k = 0; // 정렬을 마친 부분은 a[k] 이전
		while (k < n - 1) {
			int last = n - 1;
			for (int j = n - 1; j > k; j--)
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			k = last;
		}

	}

}
