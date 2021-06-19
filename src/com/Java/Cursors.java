package com.Java;
import java.util.*;

public class Cursors {

	public static void main(String[] args) {
		
		
		// delete odd number from the list
	/*	
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,12,11,14,15,17,18,20,13,9,7));
		System.out.println("Given list is:"+list);
		
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()) {
			Integer I=itr.next();
			if(I%2==0) {
				System.out.println(I);
			}
			else
				itr.remove();
		}
		*/
		
		// remove any particular element from the list
		/*
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,12,11,14,15,17,18,20,13,9,7));
		System.out.println("Given list is:"+list);
		
		ListIterator<Integer> itr=list.listIterator();
		
		while(itr.hasNext()) {
			Integer I=itr.next();
			if(I==2 || I==11 || I==9) {
				itr.remove();
			}
		}
		System.out.println("Modified list is:"+list);
		*/
		
		/*
		//get next element from a particular index
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,12,11,14,15,17,18,20));
		System.out.println("Given list is:"+list);
		
		ListIterator<Integer> itr=list.listIterator(3);
		while(itr.hasNext()) {
			Integer I=itr.next();
			System.out.println(I);
		}
		*/
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,12,11,14,15,17,18,20));
		System.out.println("Given list is:"+list);
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			Integer I=itr.next();
			if(I%2==0) {
				System.out.println(I);
			}
			else
				itr.remove();
		}
		System.out.println(list);
		

	}

}
