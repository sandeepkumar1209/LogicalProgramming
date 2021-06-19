package com.Java;

import java.util.*;
import java.io.*;

public class PropertiesTest {
	
	public static void main(String[] args) throws Exception {
		
		//How to store and read data from properties file
		
		Properties p= new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		
		String user=p.getProperty("user");
		System.out.println(user);
		
		String pwd=p.getProperty("password");
		System.out.println(pwd);
		
		String url=p.getProperty("url");
		System.out.println(url);
		
		p.setProperty("new-pwd", "ricky");
		FileOutputStream fos= new FileOutputStream("abc.properties");
		p.store(fos, "Updated By Oracle");
		
	}

}
