package codeup1;

import java.util.Scanner;

public class Q2001 {
	// 2001 : 최소 대금
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int p_min = Integer.MAX_VALUE;
		int d_min = Integer.MAX_VALUE;

		for (int i = 0; i < 3; i++) {
			int p = s.nextInt();
			if (p_min > p) p_min = p;
		}

		for (int i = 0; i < 2; i++) {
			int d = s.nextInt();
			if (d_min > d) d_min = d;
		}

		System.out.printf("%.1f", (p_min + d_min) * 1.1);
	}

}
