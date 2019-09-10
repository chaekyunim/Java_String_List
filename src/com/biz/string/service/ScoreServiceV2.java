package com.biz.string.service;

import com.biz.string.domain.ScoreVO;
import com.biz.string.domain.StudentVO;

/*
 * ScoreServiceV1은 성적정보만을 출력하는 서비스이다
 * 여기에
 * 성적정보를 출력하면서
 * 학번정보를 기준으로
 * 학생정보 (이름)을 같이 보여주는 리스트 메서드를 재 정의 하자
 * 
 * ===============================================================
 * 학번  이름   국어   영어  수학    총점     평균
 * ===============================================================
 */
public class ScoreServiceV2 {
    
	// 접근제한다
	// public : 누구나 접근 할수 있다
	// private : class scope, 현재 class 에서만 접근 가능
	// protected : 현재 클라스와 상속받은 클래스에서만 접근 가능
	// 없을 경우 : package scope,
	// 같은 package내 : public 처럼 동작으로하고
	//  다른 package끼리 : pivate 처럼 동작을 한다
	
	// 자바 패턴에서는
	// 특별한 경우가 아니면
	// 맴버변수들은 private 이나 Protected로 설정하도록
	// 권장
	
	
	// List<ScoreVO> scList proteced 상태로 설정하도록
	// 상속받아 존재하고 있다
	List<StudentVO> stdList = null;
	
	public void list() {
		
		
		System.out.println("========================================");
		System.out.println("성적일람표");
		System.out.println(""==========================================);
		System.out.println("학번|t이름|t국어|t영어|t수학|t총점");
		
		// scList는 선언, 초기화 부분이 보이지 않으만
		// ScoreServiceV1에서 protected상태로 상속받았기 때문에
		// 접근하여 값을 읽을 수 있따
		for(ScoreVO scVO : scList) {
			// 학번을 scVO로 추출
		     String strNum = stVO.getStrName(); = scVO.getStrNum();
		     //학번으로 학생정보를 조회
		     StudentVOstVO = this.searchStd(strNum);
		     
		     String strName;
		     String strAddr;
		     String strTel;
		     ifr(stVO == null) {
		    	 strNum = "(없음)";
		    	 strAddr = "(없음)";
		    	 strTel = "(없음)";
		     }else {
		    	 strNum = stVO.getStrNum();		    	 
		    	 strName = stVO.getStrName();
		    	 strAddr = stVO.gettrAddr ();
		     }
		     System.out.print(scVO.equals(getStrNum( + "|t");
		     System.out.print(strName + "|t");
		     System.out.printf();
		     System.out.printf();
		     System.out.printf();
		     System.out.printf();
		}
		
		
		
		
		System.out.println("나는 새로 작성될 list() method");
	}
	// ScoreServiceV2에 맴버변수로 선언된 stdList는
	// StudentService... 에서 값이 세팅고니 리스트 이다.
	// StudentService에서 세팅된 리스트를
	// ScoreService에서 사용하기 위해서
	// 메인() 메서드에서 학생서비스로 부터
	//   학생리스트를 getter하여
	public void setStdList(List<StudentVO>) stdList) {
		this.stdList = stdList;
	}
	
	// 학번을 매개변수 받고
	// stdList에 해당 학번의 학생정보 있는지 찾아서
	// StudentVO를 리턴해주는 메서드
	private StudentVO search(String strNum) {
		
		for(StudentVO stVO : stdList) {
			if(stVO.getStrNum().contentEquals(strNum)) {
				return stVO;
			}
		}
		
		
		
		return null;
	}
}
