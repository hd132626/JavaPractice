package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		String car = "고속버스";
		int d = 10;
		int admission = 0;
		int add = 0;
		int price = 0;
		switch(car) {
		case "고속버스":
			admission = 850;
			add = 300;
			break;
		case "경차":
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
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + d + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + price + "원");
	}
}
