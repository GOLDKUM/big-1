package com.lec.ex;
// 다차원 배열
public class Ex04 {
	public static void main(String[] args) {
		int[][] test = { {10,20,30},
				         {40,50,60} };
		test[0][2] = 300;
		System.out.println(test[0][2]);
	}
}
