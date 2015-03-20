package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int arrow1 = 9;
		int arrow2 = 10;
		double height = 5.8;
		double sadari = (arrow1+arrow2)*height/2;
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + sadari);
		arrow1 = 9;
		height = 5.4;
		double parallel = arrow1*height;
		System.out.println("평행사변형 넓이 : " + parallel );
		if(sadari>parallel) {
			System.out.println("사다리꼴이 평행사변형 보다 " + (sadari-parallel) + " 더 큽니다.");
		} else if(sadari<parallel) {
			System.out.println("평행사변형이 사다리꼴 보다 " + (parallel-sadari) + " 더 큽니다.");
		} else {
			System.out.println("평행사변형과 사다리꼴의 넓이는 같습니다.");
		}
	}
}
