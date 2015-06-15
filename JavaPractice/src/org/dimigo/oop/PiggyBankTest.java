/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	_ PiggyBankTest
 * 
 * About :
 * Date : 2015.06.15
 * </pre>
 * @author : 정성민
 * @versiont : 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		Familymember f1 = new Familymember("아빠");
		Familymember f2 = new Familymember("엄마");
		Familymember f3 = new Familymember("누나");
		Familymember f4 = new Familymember("나");
		Familymember.printMemberCnt();
		PiggyBank.putMoney(f1, 10000);
		PiggyBank.putMoney(f2, 5000);
		PiggyBank.putMoney(f3, 1000);
		PiggyBank.putMoney(f4, 2000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(f4, 1000);
		PiggyBank.printBalance();
	}
}