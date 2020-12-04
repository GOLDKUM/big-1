package com.lec.loop;
// 1 + 2 + 3 + 4 + 5 + ... + 19 + 20 = 210
public class Ex02for {
	public static void main(String[] args) {
		int tot = 0; // 누적할 변수
		for (int i = 1; i < 21; i++) {
			// tot 변수에 i값을 계속 누적하고 "i + "나 "i = "을 출력
			tot = tot + i;
			if (i != 20) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			} // if
		} // for
		System.out.println(tot);
	}// main
}
