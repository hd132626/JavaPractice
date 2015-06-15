/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	_ Familymember
 * 
 * About :
 * Date : 2015.
 * </pre>
 * @author : 정성민
 * @versiont : 1.0
 */
public class Familymember {
	private static int memberCnt;
	private String memberName;
	
	public Familymember (String memberName) {
		this.memberName=memberName;
		memberCnt++;
	}
	
	public  static void printMemberCnt() {
		System.out.println("가족 총 인원수 : " + memberCnt);
	}
	public String getMemberName() {
		return memberName;
	}
}
