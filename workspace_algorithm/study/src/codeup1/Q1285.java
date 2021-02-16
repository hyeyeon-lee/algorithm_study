package codeup1;

import java.util.Scanner;

public class Q1285 {
	// 1285 : 계산기 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;

		String org = s.nextLine();
		String[] num = org.split("[+-/*/=]");
		String[] cal = org.replaceAll("[^+-/*/=]", "").split("");
		sum = Integer.parseInt(num[0]);
		for (int i = 0; i < cal.length; i++) {
			switch (cal[i]) {
			case "+":
				sum += Integer.parseInt(num[i + 1]);
				break;
			case "-":
				sum -= Integer.parseInt(num[i + 1]);
				break;
			case "*":
				sum *= Integer.parseInt(num[i + 1]);
				break;
			case "/":
				sum /= Integer.parseInt(num[i + 1]);
				break;
			case "=":
				break;
			default:
				continue;
			}
		}
		System.out.println(sum);
	}

}
