package com.javaex.practice;

import java.util.Scanner;

public class Ex14_2 {

	public static void main(String[] args) {
		
		//switch-case : int(정수형), String만 사용가능
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double income = sc.nextDouble();
		
		double tax = 0;
		
		if(income>=0 && income<=1000){
			tax = (0.09) * income;
		}else if(income>1000 && income<=4000) {
			tax = (1000 * 0.09) + 0.18 * (income - 1000);
		}else if(income>4000 && income<8000) {
			tax = (1000 * 0.09) + (3000 * 0.18) + 0.27 * (income - 4000);
		}else {
			tax = (1000 * 0.09) + (3000 * 0.18) + (4000 * 0.27) + 0.36 * (income - 8000);
		}
		
		if(income < 0){
			System.out.println("잘못 입력했습니다.");
		}else {
			System.out.println("소득세는 " + tax + " 입니다.");
		}
		
		sc.close();
		
		
	}

}
