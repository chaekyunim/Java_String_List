package com.biz.string.exec;

import java.util.Random;

public class StringEx_04 {

	public static void main(String[] args) {
		Random rnd = new Random();
		/*
		 * 임의 난수 10개를 생성하는 반복문에서
		 * 생성된 난수의 3버냊 숫자들의 합을 구하시오
		 * (시작위치는 0부터 이다)
		 */
		for(int i = 0 ; i < 10 ; i++) {
			int rNum = rnd.nextInt();
			if(rNum < 0) {
				rNum *= (-1);
				
			}
			String strNum = rNum + "";
			
			int intNum = Imteger.valueOf(strNum.substring(3, 4));
			nSum += intNum;
			System.out.println(rNum);
			System.out.println("%4d|n",intNum);
			System.out.println("----------------------");
			
		}
		System.out.println("합계:" + nSum);

	}

}
