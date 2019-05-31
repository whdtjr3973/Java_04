package com.biz.for_Each;

public class For_06 {

	public static void main(String[] args) {
		/*
		 * 여러줄의 주석
		 * intMin부터 intMax 까지의 
		 * 1. 전체합
		 * 2. 짝수의 합
		 * 3. 홀수의 합
		 */
		
		
		int intMin = 0;
		int intMax = 10;
		
		int sum = 0 ;
		int EvenSum=0;
		int OddSum = 0;
		
		for(int i = intMin; i <= intMax; i++) {
			sum += i;
		}
		
		int intEven = intMin + intMin%2	;	
		for(int i = intEven; i <= intMax; i+=2) {
			EvenSum +=i;
		}
		
		int intOdd = intMin + ((intMin+1)%2);
		for(int i = intOdd; i <= intMax; i+=2) {
			OddSum+=i;
		}
		System.out.println(sum + " intMin부터 intMax까지 전체 합");
		System.out.println(EvenSum + " intMin부터 intMax까지 짝수의 합");
		System.out.println(OddSum + " intMin부터 intMax까지 홀수의 합");
		
	}

}
