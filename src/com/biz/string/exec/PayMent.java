package com.biz.string.exec;

public class PayMent {

	public static void main(String[] args) {
		
		int pay = 3785870;
		int mo = 50000;
		
		// 5만원권 매수
		int count = (int)(pay / mo) ;// 5만원 매수
		System.out.println(mo + "원권:" + count);
		pay = pay - count * mo; // 5만원 매수를 제외한 금액
		
		// 만원권 매수
		mo = mo / 5; // 10000
		count = (int)(pay / mo); // 1aksdnjs aotn
		System.out.println(mo + "만원:" + count);
		pay = pay - count *  mo; 
		
		//5천원권 매수
		mo = mo / 20; // 
		count = (int)(pay / mo );
		System.out.println(mo + "원권:" + count);
		pay = pay - count * mo;
		
		mo = mo / 10; 
		count = (int)(pay / mo );
		System.out.println(mo + "원권:" + count);
		pay = pay - count * mo;
		
		
		
		
		
		
	}

}
