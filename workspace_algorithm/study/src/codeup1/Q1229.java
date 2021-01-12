package codeup1;

import java.util.Scanner;

public class Q1229 {
	// 1229 : 비만도 측정 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double h = s.nextDouble();
		double w = s.nextDouble();

		double sw = 0.0; // 표준 몸무게
		if (h < 150)
			sw = h - 100;
		else if (h < 160)
			sw = (h - 150) / 2 + 50;
		else
			sw = (h - 100) * 0.9;

		double wp = (w - sw) * 100 / sw; // 비만도

		if (wp <= 10)
			System.out.println("정상");
		else if (wp <= 20)
			System.out.println("과체중");
		else
			System.out.println("비만");
	}
}
