package com.Java;

class Cat{
	int j;
	public Cat(int j) {
		this.j=j;
	}
}

class Dog implements Cloneable{
	
	Cat c;
	int i;
	
	public Dog(Cat c, int i) {
		this.c = c;
		this.i = i;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	
}

public class ShallowCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat c= new Cat(20);
		Dog d1= new Dog(c,10);
		
		System.out.println(d1.i+"---"+d1.c.j);
		
		Dog d2= (Dog) d1.clone();
		
		d1.i=888;
		d1.c.j=999;
		
		System.out.println(d2.i+"---"+d2.c.j);
		
		
		
		
		
		
		
		
	}

}