package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// 계산기 프로그램
		// 기호 : +, -, *, / (4가지)
		// 입력된 내용으로 계산하여 결과값 출력
		// 나눗셈(/)은 분모가 0이면 "계산할 수 없습니다" 출
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String sign = sc.nextLine();
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		double result;
		
		switch(sign) {
			case "+":
				result = num1 + num2;
				System.out.println("결과는: " + result);
				break;
				
			case "-":	
				result = num1 - num2;
				System.out.println("결과는: " + result);
				break;
				
			case "*":
				result = num1 * num2;
				System.out.println("결과는: " + result);
				break;
				
			case "/":
				if(num2==0) {
					System.out.println("계산할 수 없습니다.");
				}else {
					result = num1 / num2;
					System.out.println("결과는: " + result);
				}
				break;
			
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				
		}
		
				
		
		sc.close();
		
	}

}
