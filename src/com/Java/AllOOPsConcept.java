package com.Java;

//Inheritance
class One {
	public void display() {
		System.out.println("Inside class one");
	}
}

class Two extends One{
	public void display() {
		System.out.println("Inside class two");
	}
	
	public int add(int x,int y) {
		return x+y;
	}
	
	public int multiply(int x,int y) {
		return x*y;
	}
}

class Encaplutation{
	
	private String name;
	
	public void setName(String Newname) {
		name=Newname;
	}
	
	public String getName() {
		return name;
	}
}

//abstraction
abstract class TwoWheeler{
	public abstract void  wheel();
	
}

class Honda extends TwoWheeler{

	@Override
	public void wheel() {
		System.out.println("Honda vehicle has two wheel");
	}
	
}


public class AllOOPsConcept {

	public static void main(String[] args) {
		
		One o=new One();
		o.display();
		
		Two t=new Two();
		t.display();
		t.add(10, 20);
		t.multiply(10, 20);
		
		Encaplutation e= new Encaplutation();
		e.setName("Ricky");
		System.out.println(e.getName());
		
		TwoWheeler tw= new Honda();
		tw.wheel();

	}

}
