package com.biz.for_Each;

public class For_03 {

	public static void main(String[] args) {

		int sum = 0;
		int intE = 1;
		sum = sum + intE ; //1
		
		intE++;
		sum = sum + intE; // 1 + 2
		
		intE++;
		sum = sum + intE; // 1 + 2 + 3
		
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			// sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
		
		// for�� �̿��ؼ� i ���� 2,4,6,8,10�� ��Ÿ������		
		System.out.println("====¦��====");
		sum = 0;
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("¦���� �� : "+ sum);
		
		// for�� �̿��ؼ� i ���� 1,3,5,7,9�� ��Ÿ������
		
		System.out.println("====Ȧ��====");
		sum= 0;
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("Ȧ���� �� : " + sum);
		
		for(int i = 1; i <100; i++); // ���� X
		
		for(int i = 1; i <100; i++) {
			for (long j = 1; j < 1000000000; j++);
			System.out.println(i);
		}
		
	}

}
