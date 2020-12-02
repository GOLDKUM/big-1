package com.lec.loop;
//1~10까지의 홀수의 합은 25
public class Quiz2 {
	public static void main(String[] args) {
		int sum = 0;
//		for(int i=1 ; i<11 ; i+=2) {
//			sum += i;
//		}
		for(int i=1 ; i<11 ; i++) {
			if(i%2 == 1) {
				sum += i; //sum = sum+i
			}
		}
		System.out.println("1~10까지의 홀수의 합은 "+sum);
	}
}
