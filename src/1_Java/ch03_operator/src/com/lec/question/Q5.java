package com.lec.question;
import java.util.Scanner;
// 국, 영, 수, 총점, 평균
public class Q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수는 ?");
		int kor = scanner.nextInt();
		System.out.print("영어점수는 ?");
		int eng = scanner.nextInt();
		System.out.print("수학점수는 ?");
		int mat = scanner.nextInt();
		int tot = kor + eng + mat; // 총점
//		double avg = (double)tot / 3;
		double avg = tot / 3.0;
		System.out.printf("국어 : %3d\n", kor);
		System.out.printf("영어 : %3d\n", eng);
		System.out.printf("수학 : %3d\n", mat);
		System.out.printf("총점 : %d\t평균 : %.2f\n", tot, avg);
		scanner.close();
	}
}
