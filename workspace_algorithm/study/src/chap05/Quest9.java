package chap05;

// 8퀸 문제 풀이
// 비재귀적으로 풀기
public class Quest9 {

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
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (pos[j] == i) System.out.print("■");
				else System.out.print("□");
			}
			System.out.println();
		}

		System.out.println();
		// System.out.printf("%2d", pos[i]);
	}

	// i열의 알맞은 위치에 퀸을 배치
	static void set(int i) {
		int j;
		int[] jstk = new int[8];

		Start: while (true) {
			j = 0;
			while (true) {
				while (j < 8) {
					if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
						pos[i] = j;
						if (i == 7) // 모든 열에 배치 마침
							print();
						else {
							flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
							jstk[i++] = j; // i 열의 행을 Push
							continue Start;
						}
					}
					j++;
				}
				if (--i == -1) return;
				j = jstk[i]; // i 열의 행을 Pop
				flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				j++;
			}
		}
	}

}
