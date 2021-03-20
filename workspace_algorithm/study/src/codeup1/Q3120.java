package codeup1;

import java.util.Scanner;

public class Q3120 {
	// 3120 : 리모컨
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int c_temp = s.nextInt();
		int o_temp = s.nextInt();

		int sub = Math.abs(c_temp - o_temp);
		// int sub_ab = Math.abs(sub);
		System.out.println(sub);

		int cnt = 0;

		int min = Integer.MAX_VALUE;
		int div = 0;
		int temp = 0;

		int[] arr = { 1, 5, 10 };

		while (sub != 0) {
			for (int a : arr)
				if (Math.abs(sub - a) < min) {
					min = Math.abs(sub - a);
					div = a;
				}

			if (sub < div) {
				sub += min;
				temp = min;
			}

			System.out.println(div);
			cnt += sub / div;
			sub %= div;

			if (temp != 0) {
				sub += temp;
				temp = 0;
			}
			System.out.println(sub);

			if (sub == 0) break;

		}
		System.out.println(cnt);

	}

}
