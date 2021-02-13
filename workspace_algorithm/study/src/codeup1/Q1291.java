package codeup1;

import java.util.Scanner;

public class Q1291 {
	// 1291 : 바이러스 백신
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int v1 = s.nextInt();
		int min = v1;

		int v2 = s.nextInt();
		if (min > v2)
			min = v2;

		int v3 = s.nextInt();
		if (min > v3)
			min = v3;

		int vc = 1;
		for (int i = min; i >= 1; i--)
			if (v1 % i == 0 && v2 % i == 0 && v3 % i == 0) {
				vc = i;
				break;
			}

		System.out.println(vc);
	}

}
