package chap05;

import java.util.Scanner;

// 비재귀적으로 구현하기
public class Quest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		// recur3(n);
		norecur3(n);

	}

	// 비재귀로 만들 함수
	static void recur3(int n) {
		if (n > 0) {
			recur3(n - 1);
			recur3(n - 2);
			System.out.println(n);
		}

	}

	// 비재귀함수
	static void norecur3(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;

		while (true) {
			if (n > 0) {
				ptr++;
				nstk[ptr] = n;
				sstk[ptr] = sw;

				if (sw == 0) n = n - 1;
				else if (sw == 1) {
					n = n - 1;
					sw = 0;
				}
				continue;
			}

			do {
				n = nstk[ptr];
				sw = sstk[ptr--] + 1;

				if (sw == 2) {
					System.out.println(n);
					if (ptr < 0) return;
				}
			} while (sw == 2);
		}

	}

}
