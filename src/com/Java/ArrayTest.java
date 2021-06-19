package com.Java;

import java.util.*;

public class ArrayTest {
	/*
	public static int binarySearch(int []ar,int x) {
		
		int first=0;
		int last=ar.length-1;
		
		while(first<=last) {
			int middle=(first+last)/2;
			if(x==ar[middle]) {
				return middle;
			}
			else if(x>ar[middle]) {
				first=middle+1;
			}
			else
				last=middle-1;
		}
		return -1;

	}
	*/

	public static void main(String[] args) {
		
		//Merge the array
		
		/*int []ar1= {1,2,3,4,5,6,7,8};
		System.out.println("Given String is:"+Arrays.toString(ar1));
		
		int []ar2= {9,10,11,12,13,14,15,16};
		System.out.println("Given String is:"+Arrays.toString(ar2));
		
		int[] merge=new int [ar1.length+ar2.length];
		int c=0;
		
		for(int i=0;i<ar1.length;i++) {
			merge[c]=ar1[i];
			c++;
		}
		
		for(int j=0;j<ar2.length;j++) {
			merge[c++]=ar2[j];
		}
		
		System.out.println("Merger String is:"+Arrays.toString(merge));
		*/
		
		
		//Reverse a array
		
		/*int []ar= {1,2,3,4,5,6,7,8};
		System.out.println("Given String is:"+Arrays.toString(ar));
		
		int []b=new int[ar.length];
		int k=ar.length-1;
		
		for(int i=0;i<ar.length;i++) {
			b[k]=ar[i];
			k--;
		}
		System.out.println("Reverse Array is"+Arrays.toString(b));
		*/
		
		
		//Push zero to the end
		
		/*int []ar= {0,1,2,0,0,3,0,5,0,0,7,8};
		System.out.println("Given Array is:"+Arrays.toString(ar));
		
		
		int count=0;
		
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]!=0) {
			ar[count]=ar[i];
			count++;
			}
		}
		
		while(count<ar.length) {
			ar[count]=0;
			count++;
		}
		
		System.out.println("After pushing zero Array is:"+Arrays.toString(ar));
		*/
		
		
	
	  //find the biggest and second bigget element
		
		/*int []ar= {23,12,14,56,22,28,13};
		System.out.println("Given Array is:"+Arrays.toString(ar));
		
		int fbig=ar[0];
		int sbig=ar[1];
		
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>fbig) {
				sbig=fbig;
				fbig=ar[i];
			}
			else if(ar[i]>sbig) {
				sbig=ar[i];
			}
		}
		
		System.out.println("First biggest element:"+fbig);
		System.out.println("Second biggest element:"+sbig);
		
		*/
		
		
		
		//Find the missing element
		
		/*int []ar= {8,15,21,24,30,37};
		System.out.println("Missing element are:");
		
		for(int i=0;i<ar.length-1;i++) {	
		for(int j=ar[i]+1;j<ar[i+1];j++) {
			System.out.println(j);
		}
		}*/

		
		//Find the second smallest element
		
		/*
		int []ar= {10,9,4,7,2,3,1,5,6,8};
		System.out.println("Given Array is:"+Arrays.toString(ar));

        // method 1-->
		
		Arrays.sort(ar);
		int ssmall=ar[1];
	
		System.out.println("Second smallest element is:"+ssmall);
		
		//method 2->
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					 int temp;
	    			 temp=ar[i];
	    			 ar[i]=ar[j];
	    			 ar[j]=temp;
				}
			}
		}
		System.out.println("Second smallest element is:"+ar[1]);
		
		*/
		
		//Sum of element of array using Java8
		
		/*int []ar= {10,9,4,7,2,3,1,5,6,8};
		System.out.println("Given Array is:"+Arrays.toString(ar));
		
		int sum = Arrays.stream(ar).sum();
		
		System.out.println(sum);
		*/
		
		
		// Sum of sub array
		
		/*int []ar= {1,2,3};
		System.out.println("Given Array is:"+Arrays.toString(ar));
		
		int temp=0;
		int sum=0;
		
		for(int i=0;i<ar.length;i++) {
			 temp=0;
			for(int j=i;j<ar.length;j++) {
				temp+=ar[j];
				sum+=temp;
			}
		}
		
		System.out.println("Sum of sub array is:"+sum);
		
		*/
		
		// Sort the array
		
		/*int []ar= {10,9,4,7,2,3,1,5,6,8};
		System.out.println("Given Array is:"+Arrays.toString(ar));
		
		//Method-1
		Arrays.sort(ar);
		System.out.println("After sorting :"+Arrays.toString(ar));
		
		//method-2
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp=0;
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("After sorting :"+Arrays.toString(ar));
		
		*/
		
		//Occurance of element in a array
		
		/*
		int[] a = {1,1,2,3,4,4,4};

		Map<Integer,Integer>m= new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(m.containsKey(a[i])) {
				m.put(a[i], m.get(a[i])+1);
			}
			else
				m.put(a[i], 1);
		}
		
		for(Map.Entry<Integer, Integer> entry:m.entrySet()) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		*/
		
		
		// Binary Search
		/*
		int []i= {1,2,3,4,5,6,7,8};
	    System.out.println(binarySearch(i, 6));
		*/		
				
		
		
		
		
		
	}

}
