package com.biz.string.domain;

/*
 * VO(Value Object) zmffotmemfdmf wjwkdgksms Package 이름
 *      model, domain, command
 * 
 * Dto(Date Transfer Object) : VO와 쓰임새가 거의 같다
 * VO와 혼용해서 사용하는 경우도 있따
 * 
 * 일부 프로젝트 패턴, 구조에서는 VO와 구별해서
 * 사용을한다
 */
public class StudentVO {

	//맴버변수, 필드.속성
	private String strNum;
	private String strName;
	private String strAddr;
	private String strTel;
	private int intAge;
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public int getIntAge() {
		return intAge;
	}
	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}
	@Override
	public String toString() {
		return "StudentVO [strNum=" + strNum + ", strName=" + strName + ", strAddr=" + strAddr + ", strTel=" + strTel
				+ ", intAge=" + intAge + "]";
	}
	
	public StudentVO(String strNum, String strName, String strAddr, String strTel, int intAge) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strAddr = strAddr;
		this.strTel = strTel;
		this.intAge = intAge;
	
}
