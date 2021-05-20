package chap06;

import java.util.Scanner;

public class Quest4 {
	// 버블 정렬 (버전 3)
	// 비교와 교환 과정을 자세히 표시

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬 (버전 3)");
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
		int ccnt = 0; // 비교
		int scnt = 0; // 교환

		int k = 0; // 정렬을 마친 부분은 a[k] 이전
		while (k < n - 1) {
			System.out.printf("패스 %d\n", k + 1);
			int exchg = 0; // 패스 교환횟수 보관
			int last = n - 1;

			for (int j = n - 1; j > k; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %s", a[m], m != j - 1 ? " " : a[j - 1] > a[j] ? "+" : "-");
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;

				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
					scnt++;
					last = j;
				}
			}
			k = last;
			if (exchg == 0) break; // 교환 없으면 종료
		}

		// 마지막 정렬 후 출력(최종)
		for (int m = 0; m < n; m++)
			System.out.printf("%3d  ", a[m]);
		System.out.println();

		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환을 " + scnt + "회 했습니다.");

	}

}
