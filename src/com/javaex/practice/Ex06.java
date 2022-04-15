package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 두개의 숫자를 입력받고 / 큰수 & 작은수를 분류하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1= sc.nextInt();
		System.out.print("숫자2: ");
		int num2= sc.nextInt();
		
		int bigNum;
		int smallNum;
		
		if(num1>num2){
			bigNum = num1;
			smallNum = num2;
		}else {
			bigNum = num2;
			smallNum = num1;
		}
		
		System.out.print("큰수: "+ bigNum + "\t\t" + "작은수: " + smallNum + "입니다.");
		
		sc.close();
		
		
		
	}

}
