package com.Java.Pl;
import java.util.*;
import java.util.Map.Entry;

final public class ObjectTest {

	private int i;
	public ObjectTest(int i) {
		this.i=i;
	}
	public ObjectTest modify(int i) {
		if(this.i==i) {
			return this;
		}
		else
			return new ObjectTest(i);
	}
	
	public static void main(String[] args) {
		
		ObjectTest t1= new ObjectTest(10);
		ObjectTest t2= t1.modify(100);
		ObjectTest t3= t1.modify(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
	}

}


