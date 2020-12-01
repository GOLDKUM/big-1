package com.lec.condition;
import java.util.Scanner;
//현재 몇 월 인지를 키보드로부터 입력 받아 계절을 출력하는 프로그램을 구현하세요
public class Q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("지금 몇월이여요 ?");
		int month = scanner.nextInt();
		switch (month) {
		case 12:case 1: case 2:
			System.out.println("입력하신 개월은 겨울이군요.");break;
		case 3:case 4: case 5:
			System.out.println("입력하신 개월은 봄이군요.");break;
		case 6:case 7: case 8:
			System.out.println("입력하신 개월은 여름이군요.");break;
		case 9:case 10: case 11:
			System.out.println("입력하신 개월은 가을이군요.");break;
		default:
			System.out.println("떼끼");
		}
		if(month==12 || month==1 || month==2) {
			System.out.println("입력하신 개월은 겨울이군요.");
		}else if(month==3 || month==4 || month==5) {
			System.out.println("입력하신 개월은 봄이군요.");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("입력하신 개월은 여름이군요.");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("입력하신 개월은 가을이군요.");
		}else {
			System.out.println("떼끼");
		}
	}
}
