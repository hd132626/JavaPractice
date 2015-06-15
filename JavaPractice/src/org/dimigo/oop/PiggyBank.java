/**
 * 
 */
package org.dimigo.oop;
/**
 * <pre>
 * org.dimigo.oop
 * 	_ PiggyBank
 * 
 * About :
 * Date : 2015.06.15
 * </pre>
 * @author : 정성민
 * @versiont : 1.0
 */
public class PiggyBank {
	private static int balance;
	
	public static void putMoney(Familymember member, int amount) {
		balance+=amount;
		System.out.println(member.getMemberName() + "가" + amount + "원을 입금했습니다.");
	}

	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
}
