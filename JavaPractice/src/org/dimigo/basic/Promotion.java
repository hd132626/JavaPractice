package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		long money = 1700000;
		int clerk = 3;  
		int store = 1500;
		System.out.println("<<��̺��� ���� �ΰǺ�>>");
		System.out.println("�� ��� �޿� : " + String.format("%,d", money) + "��");
		System.out.printf("���� �� ���� �� : %d��\n", clerk);
		System.out.println("���� �� : " + String.format("%,d" ,store) + "��\n");
		long total = money*clerk*12*store;
		System.out.println("���� �ΰǺ� : " + String.format("%,d", total) + "��"); 
	}
}
