package codeup;

import java.util.Scanner;

public class Q1096 {
	// 1096 : [기초-2차원배열] 바둑판에 흰 돌 놓기(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		int[][] arr = new int[20][20];

		for (int i = 0; i < num; i++) {
			int x = s.nextInt(); // 가로
			int y = s.nextInt(); // 세로
			arr[x][y] = 1;
		}

		for (int x = 1; x <= 19; x++) {
			for (int y = 1; y <= 19; y++)
				System.out.printf("%d ", arr[x][y]);
			System.out.println("");
		}

	}
}
