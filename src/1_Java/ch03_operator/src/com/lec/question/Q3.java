package com.lec.question;
import java.util.Scanner;
// �Է��� �μ��� �񱳿����ڵ�(����, ũ��, �۴�, ũ�ų��۴�, �۰ų�����, �ٸ���)�� �̿��Ͽ�,
//    ���� �����  true�� O, false�� X�� ����Ͻÿ�
public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int num1 = scanner.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = scanner.nextInt();
		String result = num1 == num2 ? "0" :"X";
		System.out.println("num1 == num2�� ����� "+ result);
		boolean result2 = num1 > num2;
		System.out.println("num1 > num2�� ����� "+ 
							( (result2==true)? "O":"X") );
		scanner.close();
	}
}





