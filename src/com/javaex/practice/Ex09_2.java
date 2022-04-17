package com.javaex.practice;

import java.util.Scanner;

public class Ex09_2 {

	public static void main(String[] args) {
		// 두개의 정수 -> 작은수 / 큰수 -> 약수 T/F확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int max;
		int min;
		
		if(num1>num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		if(max%min == 0){
			System.out.println(min + " 는(은) " + max + " 의 약수입니다.");
		}else {
			System.out.println(min + " 는(은) " + max + " 의 약수가 아닙니다.");
		}
		
		sc.close();
		
	

			
		
	}
	
}
