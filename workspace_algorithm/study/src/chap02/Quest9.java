package chap02;

import java.util.Scanner;

public class Quest9 {
	// 그 해 남은 일 수를 구함

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int retry;

		System.out.println("그 해 남은 일수를 구합니다.");

		do {
			System.out.println("년: ");
			int year = s.nextInt(); // 년
			System.out.println("월: ");
			int month = s.nextInt(); // 월
			System.out.println("일: ");
			int day = s.nextInt(); // 일

			System.out.printf("%d일 남았습니다.\n", leftDayOfYear(year, month, day));
			System.out.println("한번 더 할까요? (1.예/0.아니오)");
			retry = s.nextInt();
		} while (retry == 1);
	}

	// 각 달의 일수
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }// 윤년
	};

	// 서기 year년은 윤년인가 (윤년 1:평년 0)
	static int isLeap(int year) {

		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// while문 사용하도록 보완 (i, days없이)
	static int dayOfYear(int y, int m, int d) {
		while (--m != 0) {
			d += mdays[isLeap(y)][m - 1];
		}
		return d;
	}

	// 남은 일 수 구하기
	static int leftDayOfYear(int y, int m, int d) {
		int days = 0;
		for (int i = 11; i >= m - 1; i--) {
			if (i == m - 1)
				days += mdays[isLeap(y)][i] - d;
			else
				days += mdays[isLeap(y)][i];
		}
		return days;

		/*
		 * 모범답안
		int days = d; // 일수

		for (int i = 1; i < m; i++) // 1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i - 1];

		return 365 + isLeap(y) - days;
		*/
	}

}
