package com.lec.condition;
import java.util.Scanner;
// ����ڷκ��� ����(0), ����(1), ��(2) �� �Է¹ް�,
// ��ǻ�͵� ����(0)����(1)��(2) �� �ϳ��� �����ؼ� ���ڸ� ���
public class Q3_if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2) �� �ϳ��� ���� :");
		int you = scanner.nextInt();
		if(you==0) {
			System.out.println("������ ���̳�");
		}else if(you==1) {
			System.out.println("������ ���̳�");
		}else if(you==2) {
			System.out.println("���� ���̳�");
		}else {
			System.out.println("����");
			System.exit(0);
		}
		scanner.close();
		int computer = (int)(Math.random()*3);
		if(computer==0) {
			System.out.println("���� ������");
		}else if(computer==1) {
			System.out.println("���� ������");
		}else {
			System.out.println("���� ����");
		}
		if((you +2 )%3 == computer) {
			System.out.println("����� �̰��");
		}else if(you==computer) {
			System.out.println("����");
		}else {
			System.out.println("��ǻ�Ͱ� �̰��.");
		}
//		if(you==0) {
//			if(computer==0) {
//				System.out.println("����");
//			}else if(computer==1) {
//				System.out.println("��ǻ�Ͱ� ��");
//			}else {
//				System.out.println("����� ��");
//			}
//		}else if(you==1) {
//			if(computer==0) {
//				System.out.println("����� ��");
//			}else if(computer==1) {
//				System.out.println("���");
//			}else {
//				System.out.println("��ǻ�Ͱ� ��");
//			}
//		}else if(you==2) {
//			if(computer==0) {
//				System.out.println("��ǻ�Ͱ� ��");
//			}else if(computer==1) {
//				System.out.println("����� ��");
//			}else {
//				System.out.println("���");
//			}//computer if��
//		}// you if��
	}//main�Լ�
}//class













