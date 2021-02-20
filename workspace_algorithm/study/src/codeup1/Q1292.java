package codeup1;

import java.util.Scanner;

public class Q1292 {
	// 1292 : 범인을 잡아라 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String num = s.next();
		String[] arr = num.split("");
		int sum = 0;

		for (String a : arr)
			sum += Integer.parseInt(a);

		if (sum % 7 == 4) System.out.println("suspect");
		else System.out.println("citizen");

	}

}
