package com.biz.if_then;

public class If_03 {

	public static void main(String[] args) {

		if(30 > 20) {
			System.out.println("30�� 20���� ũ��");
		}
		if(30 < 20) {
			
			// ���ǹ��� true�̸� ����Ǵ� ��ɵ�
			System.out.println("30�� 20���� �۴�");
			
		} else {
			
			//���ǹ��� true�� �ƴѰ�� ����Ǵ� ��ɵ�
			System.out.println("30�� 20���� ũ��");
		}
		
		
		// ���� ���ǹ�
		if(30 < 20) {
			System.out.println("30�� 20���� �۴�");
		} else if(30 == 20) {
			System.out.println("30�� 20�� ����");
		} else {
			System.out.println("�� �𸣰ڴ�");
		}
		
		if(30 < 20) { // false
			System.out.println("30�� 20���� �۴�");
		} else if(30 == 20) {// false
			System.out.println("30�� 20�� ����");
		} else if(30 != 20) { // true
			// �������ǹ����� ���߿� �ѹ��̶� true�� ������
			// �� ���� else ���õ� ������ �ǳ� �ڴ�.
			System.out.println("30�� 20�� �ٸ���");
		} else {// ����
			System.out.println("�� �𸣰ڴ�");
		}
		
		
		
		
	}

}
