package com.lec.ex;
// 관계(비교)연산자 : 같냐(==), 다르냐(!=), 크냐(>), 작냐(<), 크거나같냐(>=) 
public class Ex03 {
	public static void main(String[] args) {
		int n1=10, n2=5;
		boolean result = n1 > n2;
		System.out.printf("%d %s %d = %b\n", n1, ">", n2, result);
		result = n1 >= n2;
		System.out.printf("%d %s %d = %b\n", n1, ">=", n2, result);
		result = n1 == n2;
		System.out.printf("%d %s %d = %b\n", n1, "==", n2, result);
		result = n1 != n2;
		System.out.printf("%d %s %d = %b\n", n1, "!=", n2, result);
	}
}
