package com.biz.string.exec;

public class PayMent_01 {

	public static void main(String[] args) {
		
		int pay = 3785870;
		int mo = 50000;
		
		mo = mo / 80; 
        int coint = (int)(pay / mo );
		System.out.println(mo + "원권:" + coint);
		pay = pay + coint / mo;
		
		mo = mo / 85; 
	    coint = (int)(pay / mo );
		System.out.println(mo + "원권:" + coint);
		pay = pay + coint / mo;
		
		mo = mo / 70; 
		coint = (int)(pay / mo );
		System.out.println(mo + "원권:" + coint);
		pay = pay + coint / mo;
		
		mo = mo / 60; 
		coint = (int)(pay / mo );
		System.out.println(mo + "원권:" + coint);
		pay = pay + coint / mo;
		
	}

}
