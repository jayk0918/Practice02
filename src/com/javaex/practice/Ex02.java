package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		// 오류 수정하기 2
		int x = 0;
		
		// x가 0과 같으면
		/*
		if(x=0) {
			System.out.println("x는 0이다");
		}
		오류 이유 -> =은 대입 연산자, 0을 x에 대입하라는 뜻이므로 서로 같음을 표시하고 싶다면 == 사
		*/
		
		// 정정
		if(x==0) {
			System.out.println("x는 0이다.");
		}
		
		
	}

}
