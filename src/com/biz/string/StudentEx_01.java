package com.biz.string;

import com.biz.string.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		StringService stService = new StudentServiceV1();
		
		stService.intput();
		stService.list();
		
		// StudentServiceV1 클래스에
		// StudentService 인터ㅔ이스에 정의되지 않은
		// 서치() 메서드가 잇는데,
		// 그 서치() 메서드를 사용하기 위해서
		// stService를 잠시 StudentSericeV1 인 것처럼
		// 바꾸는것
		StudentVO stdVO
		((StudentSercieV1)stService).search("00001");
		
		// 서치() 메서드를 호출하면서 학번 000001을 매개변수
		// 전달하였고
		// 만약 해당학번으 ㅣ데이터가 잇으면
		//stdVO에는 학생정보가 담겨 있을 것이다
		// 혹시 데이터를 못찾았으면
		// stdVO에는 null 깂이 담겨 있을 것이다.
		

	}

}
