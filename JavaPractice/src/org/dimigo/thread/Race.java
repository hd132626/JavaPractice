package org.dimigo.thread;

public class Race {
	public static void main(String[] args) {
		
		System.out.println("main thread start");
		Runner t1 = new Runner("홍길동");
		Runner t2 = new Runner("홍길순");
		
		t1.start();
		t2.start();

		
		
		
		System.out.println("main thread end");

		
		
		
		
		
	}
}
