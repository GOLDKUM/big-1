package com.lec.condition;
import java.util.Scanner;
public class Q1_if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է��Ͻ� ���� ?");
		int su = scanner.nextInt();
		if(su>=0) {
			System.out.println("���밪�� "+su);
		}else {
			System.out.println("���밪�� "+(-1*su));
//			System.out.println("���밪�� "+(-su));
		}
		scanner.close();
	}
}
