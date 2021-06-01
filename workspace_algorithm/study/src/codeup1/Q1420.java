package codeup1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1420 {
	// 1420 : 3등 찾기

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int third = 3;

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		// 친구들의 성적은 모두 다르다 전제로 키 설정
		Map<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 0; i < n; i++) {
			String name = s.next();
			int score = s.nextInt();
			map.put(score, name);
		}

		Object[] mapKeys = map.keySet().toArray();
		Arrays.sort(mapKeys);

		// 전체 인원 - 3
		String student = map.get(mapKeys[n - third]);
		System.out.println(student);
	}

}
