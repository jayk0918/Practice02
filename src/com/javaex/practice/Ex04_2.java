package com.javaex.practice;

import java.util.Scanner;

public class Ex04_2 {

	public static void main(String[] args) {
		
		// 나이를 입력 , 19세<(1번그룹)<65세미만, 이외값은 2번그룹
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		int group;
		if(age>=19 && age<65) {
			group = 1;
		}else {
			group = 2;
		}
		
		System.out.println(group + "번그룹 입니다.");
		
		sc.close();
		
	}

}
