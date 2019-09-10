package com.biz.string;

import com.biz.string.domain.StudentVO;

public class String_01 {

	/*
	 * main() 메서드
	 * 자바에서 진빙점 메서드
	 * 1. main() 메서드는 원칙적으로 프로젝드에서 1개의
	 *   클래스에만 있어야 한다.
	 * 2. 이클립스 같은 개발 도구에서는
	 * 여러 클래스에 main() 메서드가 있는것을 허용
	 * 3. 개발도구에서 따라 Run을 실행 햇을때
	 * 어떤 클래스의 메인() 메서드를 실행할 것인지가
	 * 서로다르다
	 * 4. 이클립스에서는 현재 포커스가 있는 클래스의
	 *    메인() 메서드가 제일 먼저 실행된다
	 * 5. 만약 포커스가 잇는 클래스에
	 * 메인() 메서드가 없으면
	 * 가장 마지막에 실했던 클래스에
	 * 메인() 메서드가 없으면 가장 마지막에 실행했던 클래스의 메인() 메서드가 실행 된다 
	 */
	
	StudentVO stdVO
	((StudentSercieV1)stService).search("00001");
	
	
	
	// 서치() 메서드를 호출하면서 학번 000001을 매개변수
			// 전달하였고
			// 만약 해당학번으 ㅣ데이터가 잇으면
			//stdVO에는 학생정보가 담겨 있을 것이다
			// 혹시 데이터를 못찾았으면
			// stdVO에는 null 깂이 담겨 있을 것이다.
			

	
	public static void main(String[] args) {
		
		StringService strService = new StringServiceImpV1();
		strService.intput();
		strService.intlist();
		strService.intview();
		
	if(stdVO == null) {
		System.out.println("찾는 데이터");
	}
	else

	}

}
