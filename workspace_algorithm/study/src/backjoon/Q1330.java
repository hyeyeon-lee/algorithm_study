package backjoon;

import java.util.Scanner;

public class Q1330 {
	// 두 수 비교하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		System.out.printf("%s", a > b ? ">" : a < b ? "<" : "==");
	}

}
