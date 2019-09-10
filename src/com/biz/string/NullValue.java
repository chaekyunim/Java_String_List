package com.biz.string;

import com.biz.string.domain.StudentVO;
/*
 * null 값, null value
 * type 형변수(선언 키워드
 */
public class NullValue {

	public static void main(String[] args) {
		
		// 변수를 선언하고 초기화 하기
		// 변수선언 키워드가 첫글자가 소문자로 시작되는 선언문
		// 이때 선언된는 변수를 primitive 기분형 변수 라고 한다.
		// 기분형 변수를 클리어 할때는
		// 고유한 값으로 클리어를 해야한다
		
		int num = 0;
		float fnum = 0.0f;
		boolean b = true;
		
		// 기본형 변수를 배열로 선언을 하면
		// 이 변수(배열) 들은 참조형으로 바뀐다
		int[] nums = null;
		
		// 변수선언 키워드 첫글자가 대문자로 시작되는 선언문
		// 이때 선언되는 변수를 타입형 (참조형 레퍼런스형)
		// 변수라고 한다
		// 타입형 변수를 클리어 할때는
		// null 키워드를 사용하여 클리어 할수 있다.
		// 타입형 변수는 클리어 하지 않고
		//    직접 초기화, 생성을 하기도 한다.
		String s = "";
		
		StudentVO studentVO = null;  // 클리어
		studentVO = new StudetVO();  // 초기화, 생성
		String sNull = null;
		
		Integer num1 = 0; // 숫자 0을 값으로 갖는 벼수
		Integer  num2 = null; // 아무런 값도 없는 변수 
		
		Float fnum1 = null;
		Float fnum2 = null;
		Float fnum3 = null;
		Float fnum4 = null;
		
	}

}
