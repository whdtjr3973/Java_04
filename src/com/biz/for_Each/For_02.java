package com.biz.for_Each;

public class For_02 {
	
	public static void main(String[] args) {
		
		int intGu = 2;
		 // 변수가 For 문에 들어가는 순간 다른 For문에 적용이안됨(지역변수)
		System.out.println("====" +intGu + "단 ====" );
		for(int intEle = 2; intEle < 10; intEle++) {
			
			System.out.println(intGu+"x"+intEle+"="+intGu*intEle);
			
		}
		
		intGu ++;
		System.out.println("====" +intGu + "단 ====" );
		for(int intEle = 2; intEle < 10; intEle++) {
			
			System.out.println(intGu+"x"+intEle+"="+intGu*intEle);
			
		}
		
		
		
		
		
	}

}
