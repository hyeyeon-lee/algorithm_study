package codeup;

import java.util.Scanner;

public class Q1084 {
	// 1084 : [기초-종합] 빛 섞어 색 만들기(설명)
	public static void main(String[] args) {

		int red, green, blue;
		Scanner s = new Scanner(System.in);
		red = s.nextInt();
		green = s.nextInt();
		blue = s.nextInt();

		int cnt = 0;

		for (int i = 0; i < red; i++)
			for (int j = 0; j < green; j++)
				for (int k = 0; k < blue; k++) {
					System.out.println(i + " " + j + " " + k);
					cnt++;
				}

		System.out.println(cnt);

		s.close();

	}
}
