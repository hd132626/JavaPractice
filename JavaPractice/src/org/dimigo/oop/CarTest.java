/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	_ CarTest
 * 
 * About :ī�׽�Ʈ
 * Date : 2015.04.16
 * </pre>
 * @author : ������
 * @versiont : 1.0
 */
public class CarTest {
	public static void main(String[] args) {
		//Car2 car1=new Car2("�����ڵ���", "���׽ý�","������",225,50000000);
		//Car2 car2=new Car2("����ڵ���", "K7", "���", 246, 40000000);
		//Car2 car3=new Car2("�Ｚ�ڵ���", "SM7", "ȸ��",200, 38000000);
		
		Car3 car1=new Car3("�����ڵ���", "���׽ý�","������",225,50000000);
		Car3 car2=new Car3("����ڵ���", "K7", "���", 246);
		Car3 car3=new Car3("�Ｚ�ڵ���", "SM7", "ȸ��");
		
		System.out.println("<< �ڵ��� ��� >>");
		System.out.println("������� : " + car1.getCompany());
		System.out.println("�𵨸� : " + car1.getModel());
		System.out.println("���� : "+ car1.getColor());
		System.out.println("�ִ�ӵ� : " + car1.getMaxSpeed()+ "km");
		System.out.println("���� : " + String.format("%,d", car1.getPrice())+ "��");

		System.out.println("");
		
		System.out.println("������� : " + car2.getCompany());
		System.out.println("�𵨸� : " + car2.getModel());
		System.out.println("���� : "+ car2.getColor());
		System.out.println("�ִ�ӵ� : " + car2.getMaxSpeed()+ "km");
		System.out.println("���� : " + String.format("%,d", car2.getPrice())+ "��");

		System.out.println("");
		
		System.out.println("������� : " + car3.getCompany());
		System.out.println("�𵨸� : " + car3.getModel());
		System.out.println("���� : "+ car3.getColor());
		System.out.println("�ִ�ӵ� : " + car3.getMaxSpeed()+ "km");
		System.out.println("���� : " + String.format("%,d", car3.getPrice())+ "��");

	}
}
