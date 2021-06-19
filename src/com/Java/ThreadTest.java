package com.Java;

class A extends  Thread{
	static Thread mt;
	
	public void run() {
		
		try {
			mt.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
		
}

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException{
		A.mt =Thread.currentThread();
		A a= new A();
		a.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main  Thread");
			Thread.sleep(2000);
		}
		
	}

}
