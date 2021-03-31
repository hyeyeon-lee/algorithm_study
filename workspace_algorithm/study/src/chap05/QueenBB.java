package chap05;
// 각 열에서 1개의 퀸을 배치하는 조합을 재귀적으로 나열

public class QueenBB {

	static int[] pos = new int[8]; // 각 열의 퀸의 위치
	static boolean[] flag = new boolean[8]; // 각 행에 퀸을 배치했는지 확인

	// 각 열의 퀸의 위치를 출력
	static void print() {
		for (int i = 0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();

	}

	// i열에 퀸을 배치
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (!flag[j]) { // j행에 퀸이 없다면
				pos[i] = j; // 퀸을 j행에 배치
				if (i == 7) print(); // 배치 완료
				else {
					flag[j] = true;
					set(i + 1); // 배치 미완료, 다음열
					flag[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);

	}

}
