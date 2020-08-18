package com.Java;

class Company{
	
	int n;
	boolean f=false;
	//f=false--- chance of producer--->
	//so produce method run but  in consume method it f become true it will wait and it will consume the item then it will make f=false and notify producer that it consume the item
	//f=true chance of consumer
	synchronized public void produce(int n) throws InterruptedException{
		if(f) {
			wait();
		}
		this.n=n;
		System.out.println("Produced:"+this.n);
		f=true;
		notify();
	}
	
	synchronized public int consume() throws InterruptedException{
		if(!f) {
			wait();
		}
		System.out.println("Consumed:"+this.n);
		f=false;
		notify();
		return this.n;
	}
	
}

class Producer extends Thread{
	Company c;
	
	public Producer(Company c) {
		this.c=c;
	}
	
	public void run()  {
		int i=1;
		while(true) {
			try {
				this.c.produce(i);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {}
				i++;
			
		}
	}
}

class Consumer extends Thread{
	Company c;
	
	public Consumer(Company c) {
		this.c=c;
	}
	
	public void run() {
		
		while(true) {
			try {
				this.c.consume();	
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
			
		}
	}

public class Practice {
	
	public static void main(String[]args) {
	
		Company comp= new Company();
		Producer p= new Producer(comp);
		Consumer c= new Consumer(comp);
		
		p.start();
		c.start();
	}

}
