package codeup;

import java.util.Scanner;

public class Q1087 {
	// 1087 : [기초-종합] 여기까지! 이제 그만~(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;

		int i = 0;
		while (i++ < num) {
			sum += i;
			if (sum >= num)
				break;
		}

		System.out.println(sum);
	}
}
