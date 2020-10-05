package chap02;

import java.util.Scanner;

public class ArrayEqual {
	// 두 배열이 같은지 판단
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("배열 a의 요소 개수: ");
		int na = stdIn.nextInt();

		int[] a = new int[na];

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}

		System.out.println("배열 b의 요소 개수: ");
		int nb = stdIn.nextInt();

		int[] b = new int[nb];

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}

		if (equals(a, b))
			System.out.println("같은 배열입니다.");
		else
			System.out.println("다른 배열입니다.");

	}

	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])
				return false;

		return true;
	}
}
