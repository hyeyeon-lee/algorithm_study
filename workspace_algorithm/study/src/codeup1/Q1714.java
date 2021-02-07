package codeup1;

import java.util.Scanner;

public class Q1714 {
	// 1714 : 숫자 거꾸로 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String num = s.nextLine();
		String[] arr = num.split("");
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.printf("%s", arr[i]);
	}

}
