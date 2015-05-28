/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	_ IdolGroup
 * 
 * About : 아이돌 걸그룹 출력하는거
 * Date : 2015.5.28
 * </pre>
 * @author : 정성민
 * @versiont : 1.0
 */
public class IdolGroup {
	public static void main(String[] args) {
		String[] idolgroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		for(int i=0;i<idolgroup.length; i++) {
			System.out.println("<<" + idolgroup[i] + " 멤버>>");
			for(int j=0;j<members[i].length; j++) {
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
	}
}
