package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in); -> 입력값
		
		System.out.println("나이를 입력해주세요"); -> 정상출력
		System.out.print("나이 : "); -> 나이 : 출력 후 커서는 : 옆에 위치할 것
		age = sc.nextInt();	-> 오류 발생 원인임 : age에 자료형을 선언하지 않음
											(사실 이 밑은 보나마나이지만 int age라고 가정한다면)
		
		if(age>20) {
			System.out.println("\"1번그룹\"");	-> 입력한 age가 정수 20을 초과한다면
													\1번그룹\이라는 텍스트가 나올 것임
													
		}else {
			System.out.println("\"2번그룹\"");	-> age가 20을 초과하는 정수가 아닌 나머지 값일 경우
													\2번그룹\이라는 텍스트가 나올 것임
		}
		System.out.println("입니다.");			-> println영향으로 "입니다."는 위의 그룹 아래줄에 출력될 것임
		
		sc.close();
		*/
		
		//오류 수정 후 검증
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age>20) {
			System.out.println("\"1번그룹\""); // 그룹명 예상 오류 : \ 표기 X
													
		}else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();
		
		// 나이 대입 시 예상 결과
		// 15(2번그룹), 19(2번그룹), 20(2번그룹), 21(1번그룹), 100(1번그룹)
		
		
	}
}
