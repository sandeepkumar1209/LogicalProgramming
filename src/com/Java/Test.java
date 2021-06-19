package com.Java;

class Produce extends Thread {

	int total=0;
	
	public void run() {
		synchronized(this) {
			System.out.println("child thread start calculation");
			
			for(int i=0;i<10;i++) {
				total=total+i;
			}
			
			System.out.println("Child thread giving notification");
			this.notify();
		}
				}
}

public class Test {

	public static void main(String[] args) throws Exception {
		
		Produce p= new Produce();
		p.start();
		
		synchronized(p) {
			System.out.println("Main thread try to call wait() method");
			p.wait();
			System.out.println("Main thread got notification");
			System.out.println(p.total);
		}
		
	}

}
