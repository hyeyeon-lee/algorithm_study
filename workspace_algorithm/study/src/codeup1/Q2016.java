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

		double n3 = Math.ceil(n / 3);
		int comma = (int) n3 + 1;

		int ptr = n; // reverse
		int nPtr = 0; // newArr idx
		int cnt = 0;

		String[] newArr = new String[n + comma];

		while (ptr > 0) {
			if (cnt > 2) {
				newArr[nPtr++] = ",";
				cnt = 0;
			}
			newArr[nPtr++] = arr[--ptr];
			cnt++;
		}

		// 출력
		for (int i = newArr.length - 1; i >= 0; i--) {
			if (newArr[i] != null) System.out.print(newArr[i]);
		}
	}

}
