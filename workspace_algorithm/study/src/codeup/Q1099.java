package codeup;

import java.util.Scanner;

public class Q1099 {
	// 1099 : [기초-2차원배열] 성실한 개미
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[][] arr = new int[11][11]; // 1~10 idx 사용

		for (int i = 1; i < 11; i++)
			for (int j = 1; j < 11; j++)
				arr[i][j] = s.nextInt();

		int x = 2; // 출발 x좌표
		int y = 2; // 출발 y좌표

		while (x < 11 || y < 11 || arr[x][y] != 2) {// 맨 아래의 가장 오른쪽에 도착한 경우, 더
													// 이상 움직일 수 없는 경우, 먹이를 찾은 경우
													// 가 아니면 계속
			if (arr[x][y] == 1) {
				x++;
				y--;
				if (arr[x][y] == 1)
					break;
				else if (arr[x][y] == 2) {

					arr[x][y] = 9;
					break;
				} else {
					arr[x][y] = 9;

				}
			} else if (arr[x][y] == 2) {

				arr[x][y] = 9;
				break;
			} else {
				arr[x][y] = 9;
				y++;
			}
		}

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++)
				System.out.printf("%d ", arr[i][j]);
			System.out.println("");
		}

	}
}
