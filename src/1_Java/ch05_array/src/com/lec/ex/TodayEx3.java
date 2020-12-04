package com.lec.ex;

public class TodayEx3 {
	public static void main(String[] args) {
		int money = 2680;
		int[] coinUnit = {500,100,50,10};
		for(int coin : coinUnit) {
			System.out.print(coin+"Won coin " +
					(money/coin)+"ps. ");
			money %= coin; //money = money%coin;
		}
		for(int i=0 ; i<coinUnit.length ; i++) {
			System.out.print(coinUnit[i]+"Won coin " + (money/coinUnit[i]) + "ps. ");
			money %= coinUnit[i]; //money = money%coinUnit[i];
		}
	}
}
