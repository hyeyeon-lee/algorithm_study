package codeup1;

import java.util.Scanner;

public class Q2016 {
	// 2016 : 천단위 구분기호
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		String num = s.next();

		String[] arr = new String[n];
		arr = num.split("");

		int comma = n / 3;
		int front = n % 3;
		int cnt = 0;

		// 출력
		for (int i = 0; i < n; i++) {
			if (i >= front) {
				if (cnt % 3 == 0) {
					System.out.print(",");
				}
				cnt++;
			}
			System.out.print(arr[i]);
		}

	}

}
