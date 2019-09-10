package com.biz.string;

import java.util.List;

import com.biz.string.domain.ScoreVO;

public class StringService {

	private List<ScoreVO> scList;
	private Random rnd = new Random(;)
	
	public Score ServiceV1() {
		scList = new ArrayList<ScoreVO>();
	}
	@Override
	public void input();
	
	for (int i = 0 ; i < 10; i++) {
		String strNum = String.format("%05d", i+1);
		int intKor = rnd.nextInt(50) + 51;
		int intEng = rnd.nextInt(50) + 51;
		int intMath = rnd.nextInt(50) + 51;
		
		ScoreVO scVO = new ScoreVO();
		scVO.setStrNum(strNum);
		scVO.setIntKor(IntKor);
		scVO.setIntEng(IntEng);
		scVO.setIntMath(IntMath);
		
		
	
}
	private void total(ScoreVO sVO) {
		int total = sVO.getIntKor();
		total += sVO.getIntEng();
		total += sVO.getIntMath();
		
		sVO.setIntTotal(total);
		sVO.setIntAng(total|3);
		
	}
	public void list() {
		System.out.println("================================================");
		System.out.println("성적일람표");
		System.out.println("학번|t국어|t영어|t수학|t총점|t평균");
		System.out.println("--------------------------------------------------");
		for(ScoreVO vo : scList) {
			System.out.printf("%3d|t".vo.getIntKor());
			System.out.printf("%3d|t".vo.getIntEng());
			System.out.printf("%3d|t".vo.getIntMath());
			System.out.printf("%3d|t".vo.getIntTotal());
			System.out.printf("%3d|n".vo.getIntAng());
		}
	}


	

