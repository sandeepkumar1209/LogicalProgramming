package com.Java;

import java.io.*;

public class Mew implements Serializable {
	int i=10;
	int j=20;
}

class DogTest{
	public static void main(String[]args) throws IOException, ClassNotFoundException {
		

		Mew m1=new Mew();
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(m1);
		
		FileInputStream fis= new FileInputStream("abc.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Mew m2=(Mew)ois.readObject();
		System.out.println(m2.i+"......."+m2.j);
		
		
		
	}
}
