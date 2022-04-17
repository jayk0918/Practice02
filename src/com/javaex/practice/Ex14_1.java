package com.javaex.practice;

import java.util.Scanner;

public class Ex14_1 {

	public static void main(String[] args) {

		// 세금계산법
		// 0<=tax<=1000(만원) -> 0.09 * 수익 
		// 1000<tax<=4000 -> 1000*0.09 + 0.18*(수익 - 1000)
		// 4000<tax<8000 -> 1000*0.09 + 3000*0.18 + 0.27*(수익 - 4000)
		// 8000>= tax -> 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36(수익 - 8000)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double income = sc.nextDouble();
		double tax;
		
		if(income>=0 && income<=1000) {
			tax = 0.09 * income;
			System.out.println("소득세는 " + tax + " 입니다.");
		}else if(income>1000 && income<=4000) {
			tax = (1000*0.09) + (0.18*(income - 1000));
			System.out.println("소득세는 " + tax + " 입니다.");
		}else if(income>4000 && income<8000) {
			tax = (1000*0.09) + (3000*0.18) + (0.27*(income - 4000));
			System.out.println("소득세는 " + tax + " 입니다.");
		}else if(income>=8000) {
			tax = (1000*0.09) + (3000*0.18) + (4000*0.27) + (0.36*(income - 8000));
			System.out.println("소득세는 " + tax + " 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
		
		
		
		
		
	}

}
