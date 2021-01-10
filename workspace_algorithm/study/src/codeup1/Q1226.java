package codeup1;

import java.util.Scanner;

public class Q1226 {
	// 1226 : 이번 주 로또
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] lotto = new int[7];
		int[] myLotto = new int[6];

		// 당첨번호 입력 (오름차순 + 보너스번호)
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = s.nextInt();

		// 내 번호 입력 (오름차순)
		for (int i = 0; i < myLotto.length; i++)
			myLotto[i] = s.nextInt();

		int cnt = 0;

		for (int i = 0; i < lotto.length - 1; i++)
			for (int j = 0; j < myLotto.length; j++)
				if (lotto[i] == myLotto[j]) {
					cnt++;
					break;
				}

		switch (cnt) {
		case 6:
			System.out.println("1");
			break;
		case 5:
			for (int i = 0; i < myLotto.length; i++)
				if (myLotto[i] == lotto[6])
					cnt++;
			if (cnt == 6)
				System.out.println("2");
			else
				System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 3:
			System.out.println("5");
			break;
		default:
			System.out.println("0");

		}

	}
}
