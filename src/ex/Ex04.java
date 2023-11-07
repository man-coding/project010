package ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //키보드로부터 문자를 입력받는 클래스
		
		int num = scanner.nextInt(); //숫자를 입력받는 메소드 사용하기(숫자 입력 + 엔터)
		
		System.out.println(num+4);
	}

}
