package com.lec.loop;
import java.util.Scanner;
public class Ex10dowhile_randomNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lotto = (int)(Math.random()*45)+1; // ��ǻ�� �ζ� ����
		int su; // ����ڿ��� �Է¹��� ���� �����ϴ� ����
		do {
			System.out.print("�ζ� ��ȣ �Ѱ��� �˾Ƹ��� ������");
			su = scanner.nextInt();
			if(su>lotto) {
				System.out.println(su+"���� �������� �����ϼ���");
			}else if(su<lotto){
				System.out.println(su+"���� ū���� �����ϼ���");
			}
		}while(su!=lotto);
		System.out.println("�������� ���߼̽��ϴ�");
	}
}









