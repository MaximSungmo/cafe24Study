package com.test.standalone;

public class Adder {
	
	// ���ĵ��� ���α׷� _ �� ������ �����ϰ� ���������� �۵�
	// ���ĵ���		 _ ��ǻ�Ͱ� �ܵ����� �����ϰ� �ִ� ����
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 + num2;
			System.out.printf("%d + %d = %d",num1,num2,result);
		} catch (Exception e) {
			System.out.println("�߸��� �����Ͱ� �ԷµǾ����ϴ�.");
		}
		
	}
	
	

}
