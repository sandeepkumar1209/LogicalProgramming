package com.Java;
import java.util.*;

public class NumberTest  {
	public static void main(String[]args) {
		
		// Reverse the number
		
		/*int n=121;
		int t=n;
		int rev=0;
		while(n!=0) {
			
			rev=rev*10+(n%10);
			n=n/10;
		}

		if(rev==t) {
			System.out.println(t+" is palindrome");
		}
		else
			System.out.println(t+" is  not palindrome");
*/		
		
	/*	
		//Fibonaci Series
		
		int n=10,t1=0,t2=1;
		System.out.println("first"+n+"terms");
		
		for(int i=1;i<=n;i++) {
			System.out.print(t1+"+");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			
		}
		*/
		
		//swap two number
		
		/*int i=10, j=20;
		
		int k;
		k=i;
		i=j;
		j=k;
		
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println(i);
		System.out.println(j);
		*/
		
		//GCD of two number
		
		/*int a=10, b=15;
		
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else
				b=b-a;
		}
		
		System.out.println("Gcd of two number is :"+b);
		*/
		
		//lcm of two number
		
		/*int a=13,b=24;
		int max,step, lcm=0;
		
		if(a>b) {
			max=step=a;
		}
		else
			max=step=b;
		
		while(a!=0) {
			if(max%a==0 && max%b==0) {
				lcm=max;
				break;
			}
			max+=step;
		}
		System.out.println("LCM of Given number is:"+lcm);
		
		*/
		
		//fact of number
		
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Fact of num is:"+fact);
		
		*/
		
		//To check number is not perfect or not(6->1*2*3 means sum of divisors equals to number)
		
		/*int num=6;
		int sum=1;
		for(int i=2;i<=num/2;i++) {
			if(sum%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println(num+"is Perfect");
		}
		else
			System.out.println(num+"is not Perfect");
		*/
		
		//To check prime-number or not
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		int fact=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				fact=fact+1;
			}
		}
		
		if(fact==2) {
			System.out.println(num+ "is Prime number");
		}
		
		else
			System.out.println(num+ "is not Prime number");
		*/
		
		// Prime number from 1 to n
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		
		int num=sc.nextInt();
		
		for(int i=1;i<num;i++) {
			boolean isPrime=true;
			
			for(int j=2;j<i;j++) { 
			if(i%j==0) {
				isPrime=false;
				break;
			}
			
		}
			if(isPrime) {
				System.out.print(i+" ");
			}
			
		}
		
		sc.close();
		*/
		

		//To check number is Armstrong ore not
		//For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
	                  //	9 is an Armstrong number since 9*1= 9
		
		
		/*int num=371;
		int c=0,a;
		int temp=num;
		
		while(num>0) {
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		
		if(temp==c) {
			System.out.println("Armstrong number");
		}
		else
			System.out.println("Not Armstrong number");
		
		*/
		
		// Pascal Triangle
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of row");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			
	    //For space
		for(int space=1;space<=row-i;space++) {
			System.out.print(" ");
		}
		
		//For numbers
		int number=1;
		for(int j=0;j<=i;j++) {
			System.out.print(number+" ");
			number=number*(i-j)/(j+1);
		}
			System.out.println();
			
		}
		sc.close();
		
		
		*/
		
		// Get the Power 10
		
		/*
		int base=3;
		int power=10;
		
		//method-1
		//double result=Math.pow(base, power);
		
		//method-2
		double result=1;
		while(power!=0) {
			result*=base;
			--power;
			System.out.println(result);
		}
		
		*/
		
		//Get the average
		/*
		int []a= {10,20,30,40,50};
		int avg=0;
		int n=5;
		for(int i=0;i<a.length;i++) {
			avg=avg+a[i];
		}
		System.out.println("Avg is"+avg/n);
				
		*/
		
		//Robot code

		/*int left = 0;
		int right = 0;
		int upper = 0;
		int lower = 0;

		String position = "UDDLLRUUUDUURUDDUULLDRRRR";

		for (int i = 0; i < position.length(); i++) {
			if (position.charAt(i) == 'U') {
				upper++;
			} else if (position.charAt(i) == 'D') {
				lower++;
			} else if (position.charAt(i) == 'L') {
				left++;
			} else if (position.charAt(i) == 'R') {
				right++;
			}

		}
		System.out.println("Final Position is :(" + (right - left) + "," + (upper - lower) + ")");
				
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
