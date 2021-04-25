package backjoon;

import java.util.Scanner;

public class Q14681 {
	// 14681 사분면 고르기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x, y;
		x = s.nextInt();
		y = s.nextInt();

		int q = 0;
		if (x > 0 && y > 0) q = 1;
		else if (x < 0 && y < 0) q = 3;
		else if (x < 0 && y > 0) q = 2;
		else if (x > 0 && y < 0) q = 4;
		System.out.println(q);

	}

}
