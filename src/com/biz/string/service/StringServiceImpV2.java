package com.biz.string.service;

import java.util.List;

import com.biz.string.StringService;
import com.biz.string.domain.StudentVO;

public class StringServiceImpV2 implements StringService{

	List<StudentVO> stdList;
	public StudentServiceV1() {
		stdList = new ArrayList<StudentVO>();
		
	/*
	 * 학생정보를 무나열형태로 가지고 있는
	 * students 배열을 미리 생성해 두고
	 * 배열에 저장된 문자열을 split() 으로 분해하여
	 * 각 항목별로 만들고
	 * 
	 * 학생정보 리스트를 	
	 */
		
		
	public void input( ) {
		String[] students = new String[]
				{
				      "홍길동:서울특별시:010-111:33";
				      "성춘향:남원시:010-111:33";
				      "이몽룡:안산시:010-152:34";
				      
	};
		// students 배열의 영번째 요소에 저장된 문자열을
		// 콜론(;)을 기준으로 분해하여
		// 배열로 생성하라
	   String[ stdArray = student[0].split(":");
	   // stdArray[0] => "홍길동"
	// stdArray[0] => "서울특"
	// stdArray[0] => "010-111"
	// stdArray[0] => "33"
	   
	   
	   for(String s = students) {
		   StudentVO stdVO = new StudentVO();
	   }
	       // intNum 값을 문자열 학번으로 변환 시키고
	       // 1을 증가
		   stdArray = s.split(":");
		   
		   String strNum = String.format("%05d", intNum++);
		   stdVO.setStrNum(strNum);
		   
		   // students 요소가 담긴 s 변수를
		   // 콜론(:)문자열로 분해하여
		   // stdAddr 배열에 담긴 요소들을
		   // st 
		   stdVO.setStrName("")
		   stdVO.setStrAddr("")
		   stdVO.setStrTel("")
		   stdVO.setIntAge(Integer.valueOf);
	   }
		
	}
	
	public void list();
	
	System.out.print("===========================================");
	System.out.print("학생명부");
	System.out.print("=======================================");
	System.out.print("학번|t이름|t주소|t전화|t나이");
	for(StudentVO vo : stdList) {
		System.out.print(vo.getStrNum() + "|t");
		System.out.print(vo.getStrName() + "|t");
		System.out.print(vo.getStrAddr() + "|t");
		System.out.print(vo.getStrTel() + "|t");
		System.out.print(vo.getIntAge() + "|t");
		
	}
	System.out.printn("=====================================");
	
	
	// 학번으로 학생정보를 조회하는 메서드()
	public StudentVO search(String strNum) {
		for(StudentVO stdVO : stdList) {
			if(stdVO.getStrNum().contentEquals(strNum)) {
				System.out.println("찾았다");
				return stdVO;
			}
		}
		return null;
	}
}
