package com.javaex.practice;

import java.util.Scanner;

public class Ex10_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		int id = sc.nextInt();
		String group;
		
		if(id%3==0){
			group = "A";
		}else if(id%3==1) {
			group = "B";
		}else {
			group = "C";
		}
		
		if(id>=0) {
			System.out.println(group + "팀입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		sc.close();
		
		
	}

}
