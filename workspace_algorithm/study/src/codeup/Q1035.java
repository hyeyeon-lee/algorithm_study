import java.util.Scanner;

public class Main{

	// 1035 : [기초-출력변환] 16진 정수 1개 입력받아 8진수로 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String num = s.next();
		int hex = Integer.valueOf(num, 16);
		System.out.printf("%o", hex);
	}

}
