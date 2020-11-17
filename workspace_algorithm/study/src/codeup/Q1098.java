package codeup;

import java.util.Scanner;

public class Q1098 {
	// 1098 : [기초-2차원배열] 설탕과자 뽑기
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int h = s.nextInt() + 1; // 세로
		int w = s.nextInt() + 1; // 가로
		int[][] arr = new int[h][w]; // 배열 초기화

		int n = s.nextInt(); // 막대 개수
		for (int i = 1; i <= n; i++) {
			int l = s.nextInt(); // 막대 길이
			int d = s.nextInt(); // 방향
			int x = s.nextInt(); // x좌표
			int y = s.nextInt(); // y좌표

			for (int j = 0; j < l; j++) {
				if (d != 0) { // 세로
					arr[x++][y] = 1;
				} else { // 가로
					arr[x][y++] = 1;
				}
			}

		}

		for (int i = 1; i < h; i++) {
			for (int j = 1; j < w; j++)
				System.out.printf("%d ", arr[i][j]);
			System.out.println("");
		}
	}
}
