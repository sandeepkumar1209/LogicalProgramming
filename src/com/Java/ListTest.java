package com.Java;
import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<String>(new Temp());
		
		t.add("b");
		t.add("a");
		t.add("n");
		t.add("g");
		t.add("a");
		t.add("l");
		t.add("o");
		t.add("r");
		t.add("e");
		
		System.out.println(t);

	}

}

  class Temp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
	}	
}

		
		/*// to delete the duplicate present from the list
		
		List<Integer> list1= Arrays.asList(1,2,3,1,2,7,5,4,3,2,9,4,5,6,7,3,6,8,9);
		System.out.println("Given list is:"+list1);
		
		Set<Integer> set= new HashSet<>();
		set.addAll(list1);
		System.out.println(set);
		
*/	
		
		// Given numbers from 1 to 10 and we are supposed to get even number from 1 to 20
		/*
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(list);
		
		List<Integer>list1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list1);
		List<Integer>list2=list1.stream().map(f->f+10).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer>list3=new ArrayList<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
		*/
		
		//Coverting List to array
		
/*
		List<Integer>list=Arrays.asList(0,5,6,4,3,2,7,1,9);
		System.out.println(list);
		
		Integer[] o = (Integer[]) list.toArray();
		Integer[] o1 =list.stream().toArray(Integer[]:: new);
		
		System.out.println(Arrays.toString(o));
		System.out.println(Arrays.toString(o1));
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
