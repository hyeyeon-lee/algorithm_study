package codeup1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q1420 {
	// 1420 : 3등 찾기

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int third = 3;

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];

		// 친구들의 성적은 모두 다르다 전제로 키 설정
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String name = s.next();
			int score = s.nextInt();
			map.put(name, score);
			arr[i] = score;
		}

		// 정렬 후 세번째 찾기
		Arrays.sort(arr);
		int thirdScore = arr[n - third];

		for (String key : map.keySet())
			if (map.get(key) == thirdScore) System.out.println(key);

	}

}
