package com.biz.string;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		StringService stdService = new StudentServiceV1();
		
		// stdService에서 stdList 추출
		stdService.intput();
		List<StudentVO> stdList
		= ((StudentServiceV1)stdService).getScoreList();
		
		// stdList를 ScoreService에 주입
		StringService scService = new ScoreServiceV2();
		((ScoreServiceV2)scService).setStdList(stdList);
		
		//wjatnfmf todtjd
		scService.input();
		scService.list();
	}

}
