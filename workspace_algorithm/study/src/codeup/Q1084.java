package codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q1084 {
	// 1084 : [기초-종합] 빛 섞어 색 만들기(설명)
	public static void main(String[] args) {

		int red, green, blue;
		Scanner s = new Scanner(System.in);
		red = s.nextInt();
		green = s.nextInt();
		blue = s.nextInt();

		int cnt = 0;

		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < green; j++) {
				String str = "";
				for (int k = 0; k < blue; k++) {
					str += i + " " + j + " " + k + "\n";
					cnt++;
				}
				try {
					bf.write(str);
					bf.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println(cnt);
		s.close();

	}
}
