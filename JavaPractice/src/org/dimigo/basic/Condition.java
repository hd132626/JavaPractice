package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		String car = "��ӹ���";
		int d = 10;
		int admission = 0;
		int add = 0;
		int price = 0;
		switch(car) {
		case "��ӹ���":
			admission = 850;
			add = 300;
			break;
		case "����":
			admission = 300;
			add = 200;
			break;
		default:
			admission = 600;
			add = 200;
			break;
		}
		if(d<=10) {
			price = admission;
		}
		else if(d>10) {
			price = admission + (d/10)*add;
		}
		System.out.println("<< ��ӵ��� ����� ��� >>");
		System.out.println("�Ÿ� : " + d + "km");
		System.out.println("���� : " + car);
		System.out.println("����� : " + price + "��");
	}
}
