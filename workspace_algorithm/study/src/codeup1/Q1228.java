package codeup1;

import java.util.Scanner;

public class Q1228 {
	// 1228 : 비만도 측정 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double h = s.nextDouble();
		double w = s.nextDouble();

		double sw = (h - 100) * 0.9; // 표준 몸무게
		double wp = (w - sw) * 100 / sw; // 비만도

		if (wp <= 10)
			System.out.println("정상");
		else if (wp <= 20)
			System.out.println("과체중");
		else
			System.out.println("비만");
	}
}
