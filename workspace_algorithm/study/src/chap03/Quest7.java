package chap03;
// 신체검사 데이터 배열에서 이진 검색하기

// 시력에 대한 내림차순 정렬에서 특정 시력을 가진 사람 검색하기

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Quest7 {
	// 신체검사 데이터를 정의합니다
	static class PhyscData {
		private String name; // 이름
		private int height; // 키
		private double vision; // 시력

		// 생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		// 문자열을 반환하는 메서드 (확인용)
		public String toString() {
			return "PhyscData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
		}

		// 내림차순으로 정렬하기 위한 comparator
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

		private static class VisionOrderComparator implements Comparator<PhyscData> {

			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				// TODO Auto-generated method stub
				return (o1.vision > o2.vision) ? 1 : (o1.vision < o2.vision) ? -1 : 0;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = { // 시력순
				new PhyscData("이나령", 162, 0.3), new PhyscData("유지훈", 168, 0.4), new PhyscData("김한결", 169, 0.7),
				new PhyscData("홍준기", 171, 0.8), new PhyscData("전서현", 173, 1.2), new PhyscData("이호연", 175, 1.5),
				new PhyscData("이수민", 178, 2.0), };
		System.out.println("시력이 몇인 사람을 찾고 있나요? :");
		double vision = stdIn.nextDouble(); // 찾는 시력 입력
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);

		if (idx < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]);
		}
	}

}
