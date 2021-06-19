package com.Java.Pl;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Test implements Serializable, Cloneable{
	
	int a=10;
	int b=20;
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class WaysToCreateObject {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, IOException, CloneNotSupportedException {
		
		//Using new keyword
		Test t1= new Test();
		System.out.println(t1);
		
		//Using newInstance method
		Test t2 =(Test) Class.forName("com.Java.Pl.Test").newInstance();
		System.out.println(t2);
		
		//Using newInstance of constructor class
		Constructor<Test>c=Test.class.getConstructor();
		Test t3 = c.newInstance();
		System.out.println(t3);
		
		// Using deserialization
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		Test t4= new Test();
		System.out.println(t4);
		oos.writeObject(t4);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Test t5 =(Test) ois.readObject();
		System.out.println(t5);
		System.out.println(t5.a+"----"+t5.b);
		
		//Using clonning
		Test t6= new Test();
		Test t7 = (Test) t6.clone();
		
		t6.a=111;
		t6.b=222;
		
		System.out.println(t7.a+"----"+t7.b);
		

	}

}
