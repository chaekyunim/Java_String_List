package com.biz.string.exec;

public class StringEx_02 {

	public static void main(String[] args) {
		
		String[] nameList = new String[] {
				"을지문덕:001:66",
				"맥가더장군:001:33",
				"성춘향:003:",
				"홍길동:002:33",
				"장길산:003:44",
				"이세민:003:",
				"임꺽정:002:33",
				"장길산:003:44",
				"성춘향:003:"
		};
		int nCount = 0;
		for(String s : nameList) {			
			try {
			String [] name = s.split(":");
			System.out.println("이름:" + name[0]);
			System.out.println("학번:" + name[1]);
			System.out.println("나이:" + name[2]);
		} catch (Exception e) {
			System.out.println("Exception 발생");
			System.out.printf("%d 번째 데이터",nCount);
			
		}
			nCount ++;

	}
	}
}
