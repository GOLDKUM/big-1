package com.lec.ex;

public class TodayEx3 {
	public static void main(String[] args) {
		int money = 2680;
		int[] coinUnit = {500,100,50,10};
		for(int coin : coinUnit) {
			System.out.print(coin+"원 짜리는 "+
					(money/coin) +"개.  ");
			money %= coin; //money = money%coin;
		}
//		for(int i=0 ; i<coinUnit.length ; i++) {
//			System.out.print(coinUnit[i]+"원 짜리는 "+
//						(money/coinUnit[i]) +"개.  ");
//			money %= coinUnit[i]; //money = money%coinUnit[i];
//		}
	}
}
