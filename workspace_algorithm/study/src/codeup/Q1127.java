package codeup;

import java.util.Scanner;

public class Q1127 {
	// 1127 : 성적 계산
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float midP = s.nextFloat();
		int midS = s.nextInt();
		float finP = s.nextFloat();
		int finS = s.nextInt();
		float exP = s.nextFloat();
		int exS = s.nextInt();

		System.out.printf("%.1f", midP * midS + finP * finS + exP * exS);

	}
}
