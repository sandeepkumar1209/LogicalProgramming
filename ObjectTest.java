package com.Java;

class Company{
	
}

class Producer extends Thread{
	Company c;
	Producer (Company c){
		this.c=c;
	}
}

class Consumer extends Thread{
	Company c;
	Consumer (Company c){
		this.c=c;
	}
}
public class ObjectTest {

	public static void main(String[] args) {
		Company comp= new Company();
		Producer p= new Producer(comp);
		Consumer c= new Consumer(comp);
		
		p.start();
		c.start();

	}

}
