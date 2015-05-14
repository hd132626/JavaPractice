/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	_ Question
 * 
 * About :
 * Date : 2015.
 * </pre>
 * @author : 정성민
 * @versiont : 1.0
 */
import java.util.Scanner;
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String student = "김병학";
		String student2 = "정성민";
		String student3 = "김정욱";
		System.out.println("가장 머리가 큰 학생은?");
		String answer = scanner.nextLine();
		if(student.equals(answer)) System.out.println("정답입니다");
		else System.out.println("틀렸습니다 TT");
		System.out.println("가장 똑똑한 학생은?");
		answer = scanner.nextLine();
		if(student2.equals(answer)) System.out.println("정답입니다");
		else System.out.println("틀렸습니다 TT");
		System.out.println("가장 멍청한 학생은?");
		answer = scanner.nextLine();
		if(student3.equals(answer)) System.out.println("정답입니다");
		else System.out.println("틀렸습니다 TT");
		scanner.close();
	}	
}
