package chap05;

// 8퀸 문제 풀이
public class EightQueen {

	static boolean[] flag_a = new boolean[8]; // 각 행에 퀸이 있는지 체크
	static boolean[] flag_b = new boolean[15]; // 우상향 대각선 퀸 체크
	static boolean[] flag_c = new boolean[15]; // 좌상향 대각선 퀸 체크
	static int[] pos = new int[8]; // 각 열의 퀸 위치

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);

	}

	// 각 열의 현재 퀸 위치 출력
	static void print() {
		for (int i = 0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}

	// i열 적당한 위치에 퀸 배치
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false && // 가로(j행)에 배치되지 않음
					flag_b[i + j] == false && // 우상향 대각선에 아직 배치되지 않음
					flag_c[i - j + 7] == false // 좌상향 대각선에 아직 배치되지 않음
			) {
				pos[i] = j;
				if (i == 7) print();
				else {
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;

				}

			}
		}
	}

}
