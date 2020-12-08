package chap03;

import java.util.Scanner;

public class Quest3 {
	// 일치한 요솟수 반환 메서드

	static int searchIdx(int[] a, int n, int key, int[] idx) {

		int j = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == key)
				idx[j++] = i;
		}
		return j;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요솟수 입력: ");
		int num = stdIn.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			arr[i] = stdIn.nextInt();
		}

		System.out.println("key 값 입력: ");
		int key = stdIn.nextInt();

		int[] idx = new int[num];
		int count = searchIdx(arr, num, key, idx);

		System.out.println("count: " + count);
		if (count == 0) {
			System.out.println("요소가 없습니다.");
		} else {
			for (int i = 0; i < count; i++)
				System.out.println("x[" + idx[i] + "]");
		}

	}
}
