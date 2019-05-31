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
		
		// for를 이용해서 i 값이 2,4,6,8,10만 나타나도록		
		System.out.println("====짝수====");
		sum = 0;
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("짝수의 합 : "+ sum);
		
		// for를 이용해서 i 값이 1,3,5,7,9만 나타나도록
		
		System.out.println("====홀수====");
		sum= 0;
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("홀수의 합 : " + sum);
		
		for(int i = 1; i <100; i++); // 실행 X
		
		for(int i = 1; i <100; i++) {
			for (long j = 1; j < 1000000000; j++);
			System.out.println(i);
		}
		
	}

}
