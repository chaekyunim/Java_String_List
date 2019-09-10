package com.biz.string.service;

import java.util.List;

import javax.management.monitor.StringMonitorMBean;

public class StringServiceImpV1 implements StringMonitorMBean {

	List<String> strListr;
	
	/*
	 * 
	 * 매개변수가 없는 생성자
	 * = 기본생성자 슈퍼생성자
	 * 1. 필드(맴버변수)중에 객체들을 사용할수 있도록
	 *      초기화 생성코드를 작성하는 영역
	 *      Null
	 */
	
	public StringServiceImpV1( ) {
		strList = ArrayList<String>();
		scan = new Scanner(System.in);
		rnd = new Random();
	
	//1. 생성할 배열크기를 먼저 설정한 후
	//	 각 요소의 값을 성정 하는 방법	
	@Override
	public void input();
	String[] strStudent = new String[3];
	strStudent[] = "홍길동:익산시:010-111:33";
    strStudent[] = "성춘향:서울특별시:010-222";
    strStudent[] = "이묭룡:안산시:010-333:16";
    
   // 2. 배열에 설정할 요소가 미리 정해진 경우
   // 배열의 크기를 성정하지 않고
   // 요소를 나열하여 배열의 크기를 자동  성정한 후
   // 요소를 설정 할당 채워넣기 하는 방법
   // String[] strNation
         = new String[] {
        		 "대한민국",
        		 "미국",
        		 "프랑스",
        		 "영국",
        		 "독일"};
        		 
       for(int = 0 ; i < strStudent.length; i++) {
    	   System.out.println(strStudent);
         }
}
}
