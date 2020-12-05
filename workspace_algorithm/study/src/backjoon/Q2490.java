package backjoon;

import java.util.Scanner;

public class Q2490 {
	// 윷놀이
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String[] arr = new String[3];

		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			arr[i] = s.nextLine();
			String[] num = arr[i].split(" ");
			for (String n : num) {
				if (n.equals("0"))
					cnt++;
			}
			switch (cnt) {
			case 0:
				System.out.println("E");
				break;
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			default:
				break;
			}

		}

	}

}
