package chap01;

import java.util.Scanner;

// 3���� �������� �Է��ϰ� �ִ��� ���մϴ�.

public class Max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.println("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.println("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.println("c�� �� : ");
		int c = stdIn.nextInt();

		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		System.out.println("�ִ��� " + max + "�Դϴ�.");
	}

}
