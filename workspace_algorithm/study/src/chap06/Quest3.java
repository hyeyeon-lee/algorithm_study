package chap06;

import java.util.Scanner;

public class Quest3 {
	// 버블 정렬 (버전 2)
	// 비교와 교환 과정을 자세히 표시

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
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스 %d\n", i + 1);
			int exchg = 0; // 패스 교환횟수 보관
			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %s", a[m], m != j - 1 ? " " : a[j - 1] > a[j] ? "+" : "-");
				System.out.printf("%3d\n", a[n - 1]);
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
				if (exchg == 0) break; // 교환 없으면 종료
			}
		}

	}

}
