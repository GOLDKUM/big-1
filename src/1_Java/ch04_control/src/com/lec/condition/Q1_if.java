package com.lec.condition;
import java.util.Scanner;
public class Q1_if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력하실 수는 ?");
		int su = scanner.nextInt();
		if(su>=0) {
			System.out.println("절대값은 "+su);
		}else {
			System.out.println("절대값은 "+(-1*su));
//			System.out.println("절대값은 "+(-su));
		}
		scanner.close();
	}
}
