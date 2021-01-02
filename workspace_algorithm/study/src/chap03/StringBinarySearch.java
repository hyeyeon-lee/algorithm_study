package chap03;
// 문자열의 배열(Java의 키워드)에서 검색

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);

		// Java에서 사용하는 키워드입니다.
		String[] x = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for",
				"goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new",
				"package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch",
				"synchronized", "this", "throw", "throws", "trasient", "try", "void", "volatile", "while" };

		System.out.println("원하는 키워드를 입력하세요. :");
		String ky = stdIn.next(); // 키 값 입력

		int idx = Arrays.binarySearch(x, ky); // 배열 x에서 ky 검색
		if (idx < 0)
			System.out.println("해당 키워드가 없습니다.");
		else
			System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");

	}

}
