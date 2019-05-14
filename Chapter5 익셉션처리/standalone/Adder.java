package com.test.standalone;

public class Adder {
	
	// 스탠드얼론 프로그램 _ 웹 서버와 무관하게 독립적으로 작동
	// 스탠드얼론		 _ 컴퓨터가 단독으로 동작하고 있는 형태
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 + num2;
			System.out.printf("%d + %d = %d",num1,num2,result);
		} catch (Exception e) {
			System.out.println("잘못된 데이터가 입력되었습니다.");
		}
		
	}
	
	

}
