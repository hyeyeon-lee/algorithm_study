package backjoon;

import java.util.Scanner;

public class Q10430 {
	// 10430 나머지
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b, c;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}

}
