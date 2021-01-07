package codeup1;

import java.util.Scanner;

public class Q1216 {
	// 1216 : 컨설팅 회사
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int notPrmIncome = s.nextInt();
		int prmIncome = s.nextInt();
		int prmPrice = s.nextInt();

		int profit = prmIncome - prmPrice;

		if (profit > notPrmIncome)
			System.out.println("advertise");
		else if (profit < notPrmIncome)
			System.out.println("do not advertise");
		else
			System.out.println("does not matter");

	}
}
