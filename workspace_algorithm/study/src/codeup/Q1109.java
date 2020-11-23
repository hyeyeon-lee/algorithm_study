package codeup;

import java.util.Scanner;

public class Q1109 {
	// 1109 : 보안카드 접수증
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String name = s.next();
		int age = s.nextInt();
		char part = s.next().charAt(0);
		String key = s.next();
		System.out.printf("%s\n", name);
		System.out.printf("%d\n", age);
		System.out.printf("%s\n", part);
		System.out.printf("%s", key);

	}
}
