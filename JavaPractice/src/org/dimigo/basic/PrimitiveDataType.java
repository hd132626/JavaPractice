package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		System.out.println("<< ������ ������ >>");
		String name = "������";
		boolean gender = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char blood = 'A';
		System.out.println("�̸� : " + name);
		if(gender) {
			System.out.println("���� : ����");
		}
			else {
				System.out.println("���� : ����");
			}
		System.out.printf("���� : %d��\n", age);
		System.out.println("Ű : " + height + "cm");
		System.out.println("������ : " + weight + "kg");
		System.out.println("������ : " + blood + "��");
	}
}