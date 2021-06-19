package com.Java;


public class InnerclassTest {

	public void m1() {
	
	int y=20;
	
	class inner{
		
		public  void m2() {
			
			System.out.println(y);
		}
		
	}
	inner i= new inner();
	i.m2();
	}
	
	public static void main(String[] args) {
		InnerclassTest o =new InnerclassTest();
		o.m1();		
		

	}

}
