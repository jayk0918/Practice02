package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 키&몸무게 입력값 수용
		// 표준체중 = (키-100)*0.9
		// 저체중, 표준, 과체중 구분출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int height = sc.nextInt();
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		double std_weight = ((height-100)*0.9);
		if(weight<std_weight) {
			System.out.println("저체중 입니다.");
		}else if(weight==std_weight){
			System.out.println("표준 입니다.");
		}else {
			System.out.println("과체중 입니다.");
		}
		System.out.println("표준체중: " + std_weight);
		
		sc.close();
		
	}

}
