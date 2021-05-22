package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15552 {

	// 15552 빠른 A+B
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());// 총 테스트케이스

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());

			int[] arr = new int[2];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			bw.write(String.valueOf(arr[0] + arr[1])); // string.valueOf int ->
														// string 출력
			bw.write("\n");
		}
		bw.flush();

	}

}
