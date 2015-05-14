/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	_ Score
 * 
 * About :
 * Date : 2015.
 * </pre>
 * @author : 정성민
 * @versiont : 1.0
 */
import java.util.Scanner;
public class Score {
	public static void main(String[] args) {
		int kor, math, eng;
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		eng = scanner.nextInt();
		String sb = new StringBuilder()
		.append("<< 점수 출력 >>\n")
		.append("국어 점수 : ")
		.append(kor)
		.append("점\n")
		.append("수학 점수 : ")
		.append(math)
		.append("점\n")
		.append("영어 점수 : ")
		.append(eng)
		.append("점\n")
		.append("총점 : ")
		.append( kor+math+eng)
		.append("점\n")
		.append("평균 점수 : ")
		.append(String.format("%.1f",( kor+math+eng)/3.0))
		.append("점\n").toString();
		System.out.println(sb);
		scanner.close();
	}
}
