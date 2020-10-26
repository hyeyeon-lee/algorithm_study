package codeup;

import java.util.Scanner;

public class Q1080 {
	// 1080 : [기초-종합] 언제까지 더해야 할까?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		int i = 0;

		while(sum < num)
			sum+=++i;
		System.out.println(i);

	}
}
