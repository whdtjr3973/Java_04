package com.biz.if_then;

public class If_04 {

	public static void main(String[] args) {

		// 1���� 100���� ���� �߿���
		// 6�� ������� ���� �ʹ�.
		for(int i = 1; i <100; i++) {
			// i�� 6���� ���������� �������� 0�� ��
			// ==> 6�� ���
			if(i%6 == 0) {
				System.out.println(i +"�� 6�� ����Դϴ�");
			}
		}
	}

}
