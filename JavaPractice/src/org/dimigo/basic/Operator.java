package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int arrow1 = 9;
		int arrow2 = 10;
		double height = 5.8;
		double sadari = (arrow1+arrow2)*height/2;
		System.out.println("<< ���� ���� �� >>");
		System.out.println("��ٸ��� ���� : " + sadari);
		arrow1 = 9;
		height = 5.4;
		double parallel = arrow1*height;
		System.out.println("����纯�� ���� : " + parallel );
		if(sadari>parallel) {
			System.out.println("��ٸ����� ����纯�� ���� " + (sadari-parallel) + " �� Ů�ϴ�.");
		} else if(sadari<parallel) {
			System.out.println("����纯���� ��ٸ��� ���� " + (parallel-sadari) + " �� Ů�ϴ�.");
		} else {
			System.out.println("����纯���� ��ٸ����� ���̴� �����ϴ�.");
		}
	}
}
