package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 두 개의 정수 입력받아 / 큰수를 작은수로 나눈 몫&나머지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int quot;
		int remain;
		
		if(num1>num2) {
			quot = num1/num2;
			remain = num1%num2;
		}else {
			quot = num2/num1;
			remain = num2%num1;
		}
		
		System.out.println("몫: " + quot);
		System.out.println("나머지: " + remain);
		
		sc.close();
		
		
		
	}

}
