/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	SnackTest
 * 
 * About :
 * Date : 2015.05.18
 * </pre>
 * @author : 정성민
 * @versiont : 1.0
 */
public class SnackTest {
	public static void main(String[] args) {
		int sum=0;
		Snack[] SnackArr={
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		for(Snack Snack : SnackArr) {
			Snack.printSnack();
			sum+=Snack.calcPrice();
		}
		System.out.println("총 구매금액 : " + String.format("%,d", sum) + "원");
	}
}
