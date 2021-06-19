package com.Java;

class Rat{
	int j;
	public Rat(int j) {
		this.j=j;
	}
}

class Mice implements Cloneable{
	
	Rat c;
	int i;
	
	public Mice(Rat c, int i) {
		this.c = c;
		this.i = i;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Rat c1= new Rat(c.j);
		Mice d = new Mice(c1,i);
		
		return d;
	}
	
}

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Rat c= new Rat(20);
		Mice d1= new Mice(c,10);
		
		System.out.println(d1.i+"---"+d1.c.j);
		
		Mice d2= (Mice) d1.clone();
		
		d1.i=888;
		d1.c.j=999;
		
		System.out.println(d2.i+"---"+d2.c.j);
		

	}

}
