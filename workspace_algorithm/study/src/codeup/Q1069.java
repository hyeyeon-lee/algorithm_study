package codeup;

import java.util.Scanner;

public class Q1069 {

	// 1069 : [기초-조건/선택실행구조] 평가 입력받아 다르게 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		char score = s.next().charAt(0);

		switch (score) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}

	}

}
