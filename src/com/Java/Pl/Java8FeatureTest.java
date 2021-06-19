package com.Java.Pl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
class Student{
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}*/

public class Java8FeatureTest {

	public static void main(String[] args) {
		
/*		Function<Student,String>f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A";
			else if(marks>=60) grade="B";
			else if(marks>=50) grade="C";
			else if(marks>=35) grade="D";
			else grade="E";
			return grade;
		};
		Predicate<Student>p=s->s.marks>60;
		
		Consumer<Student>c=s1->{
			System.out.println("Student name:"+s1.name);
			System.out.println("Student Marks"+s1.marks);
			System.out.println("Student Grade"+f.apply(s1));
			System.out.println();
		};
		
		Student[]s= {
				new Student("Durga", 100),
				new Student("Sunny", 65),
				new Student("Chiny", 55),
				new Student("Miny", 45),
				new Student("Kunu", 25)
		};
		
		for(Student s1:s) {
			if(p.test(s1)) {
				c.accept(s1);
			}

		}
		
*/

		//To get otp by using Supplier
		Supplier<String> s=()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());
		
	}

}
