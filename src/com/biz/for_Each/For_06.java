package com.biz.for_Each;

public class For_06 {

	public static void main(String[] args) {
		/*
		 * �������� �ּ�
		 * intMin���� intMax ������ 
		 * 1. ��ü��
		 * 2. ¦���� ��
		 * 3. Ȧ���� ��
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
		System.out.println(sum + " intMin���� intMax���� ��ü ��");
		System.out.println(EvenSum + " intMin���� intMax���� ¦���� ��");
		System.out.println(OddSum + " intMin���� intMax���� Ȧ���� ��");
		
	}

}
