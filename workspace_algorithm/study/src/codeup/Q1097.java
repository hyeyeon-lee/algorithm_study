package codeup;

import java.util.Scanner;

public class Q1097 {
	// 1097 : [기초-2차원배열] 바둑알 십자 뒤집기(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[][] arr = new int[20][20];

		// 바둑판 상황 입력 받기
		for (int x = 1; x <= 19; x++) {
			for (int y = 1; y <= 19; y++)
				arr[x][y] = s.nextInt();
		}

		int num = s.nextInt();

		for (int i = 1; i <= num; i++) {
			int x = s.nextInt();
			int y = s.nextInt();

			for (int xp = 1; xp <= 19; xp++) {
				if (arr[xp][y] == 0)
					arr[xp][y] = 1;
				else
					arr[xp][y] = 0;
			}
			for (int yp = 1; yp <= 19; yp++) {
				if (arr[x][yp] == 0)
					arr[x][yp] = 1;
				else
					arr[x][yp] = 0;
			}
		}

		for (int i = 1; i <= 19; i++) {
			for (int j = 1; j <= 19; j++)
				System.out.printf("%d ", arr[i][j]);
			System.out.println("");
		}
	}
}
