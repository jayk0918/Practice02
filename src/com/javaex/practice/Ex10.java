package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 사번(양의 정수)를 입력하면 / 팀을 확인할 수 있게
		// 팀 : A, B, C팀
		// 사번을 3으로 나누었을 때 %가 0 = A팀, 1 = B팀, 2 = C팀
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		int num = sc.nextInt();
		if(num>=0){
			if(num%3==0){
				System.out.println("A팀입니다.");
			}else if(num%3==1) {
				System.out.println("B팀입니다.");
			}else {
				System.out.println("C팀입니다.");
			}
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		sc.close();
	}
}