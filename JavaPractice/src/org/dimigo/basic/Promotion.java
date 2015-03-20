package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		long money = 1700000;
		int clerk = 3;  
		int store = 1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", money) + "원");
		System.out.printf("점포 내 직원 수 : %d명\n", clerk);
		System.out.println("점포 수 : " + String.format("%,d" ,store) + "개\n");
		long total = money*clerk*12*store;
		System.out.println("연간 인건비 : " + String.format("%,d", total) + "원"); 
	}
}
