package codeup1;

import java.util.Scanner;

public class Q1920 {
	// 1920 : (재귀함수) 2진수 변환

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int dec = s.nextInt();
		toBinary(dec);

	}

	public static void toBinary(int dec) {
		dec /= 2;
		if (dec != 0) {
			System.out.print(dec % 2);
			toBinary(dec);
		} else System.out.print(dec);

	}

}
