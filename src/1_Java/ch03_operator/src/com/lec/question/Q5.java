package com.lec.question;
import java.util.Scanner;
// ��, ��, ��, ����, ���
public class Q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���������� ?");
		int kor = scanner.nextInt();
		System.out.print("���������� ?");
		int eng = scanner.nextInt();
		System.out.print("���������� ?");
		int mat = scanner.nextInt();
		int tot = kor + eng + mat; // ����
//		double avg = (double)tot / 3;
		double avg = tot / 3.0;
		System.out.printf("���� : %3d\n", kor);
		System.out.printf("���� : %3d\n", eng);
		System.out.printf("���� : %3d\n", mat);
		System.out.printf("���� : %d\t��� : %.2f\n", tot, avg);
		scanner.close();
	}
}
