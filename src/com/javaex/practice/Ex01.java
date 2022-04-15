package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// 오류 정정하기
		int age = 15;
		
		//age가 0살 초과이고 18살 미만이면
		/*if(0< age< 18) {
			System.out.println("청소년입니다.");			
		}
		
		오류메세지 :
		The operator < is undefined for the argument type(s) boolean, int
		즉, 한 번에 조건 하나만 서술하던지 / &&, ||와 같은 식을 서술해주어야 함
		*/
		
		
		// 정정 1. (&&활용)
		
		if(0<age && age<18) {
			System.out.println("청소년입니다.");
		}
		
		// 정정 2.(조건 나열서술)
		if(0<age) {
			if(age<18) {
				System.out.println("청소년입니다.");
			}
		}
		
	}

}
