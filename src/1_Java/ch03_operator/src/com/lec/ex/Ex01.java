package com.lec.ex;
// ��������� (+,-,*,/,%����������)
public class Ex01 {
	public static void main(String[] args) {
		int n1 = 33, n2=10;
		int result;
		double resultDouble;
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n", n1, '+', n2, result);
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n", n1, '-', n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n", n1, '*', n2, result);
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n", n1, '/', n2, result);
		resultDouble = n1 / (double)n2;
		System.out.printf("%d %c %d = %.1f\n", n1, '/', n2, resultDouble);
		result = n1 % n2;
		System.out.printf("%d %c %d = %d\n", n1, '%', n2, result);
		// ������ �������� ���ӻ�
		if (n1%2==0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
	}// main�Լ� ��
}// class ��









