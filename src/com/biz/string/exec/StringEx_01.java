package com.biz.string.exec;

public class StringEx_01 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		// strNation에 담긴 문자열을
		// 알파벳단위로 한글자씩 잘라서
		// strs1 배열에 담아라
		String[] strs1 = strNation.split("");
		
		for(String s : strs1) {
			System.out.println(s);
		}
		// strNation 에 담긴 문자열을
		// 스페이스(" ")기준으로 잘라서
		// strs2 배열에 담아라
	    String[] strS2 = strNation.split(" "); // 3개의 배열
	    System.out.println("0:"+ strS2[0]);
	    System.out.println("1:"+ strS2[1]);
	    System.out.println("2:"+ strS2[2]);
	    try {
	    	System.out.println("3:"+ strS2[3]);
	    } catch (Exception e) {
	    	// 코드 없음
	    	// 만약 exception이 발생하면
	    	// 모든것을 무시하라
	    }
	    	 try {
	 	    	System.out.println("3:"+ strS2[3]);
	 	    } catch (Exception e) {
	 	    	// try {} 내의 코드가 실행되는 과정에서
	 	    	// exception이 발생하면
	 	    	// JVM 은 catch(e) {} 블럭에게
	 	    	// exception 정보를 전달한다
	 	    	// 이때  exception 정보는 변수 e가 받아서 가지고 있따
	 	    	// e 변수의 printStackTrace
	 	    	e.printStackTrace();
	    }
	    
		
		
		

	}

}
