package com.Java;


final class P{
	int i;
	public P(int i) {
		this.i=i;
	}
	
	public P modify(int i) {
		if(this.i==i) {
			return this;
		}
		else
			return new P(i);
	}
}


public class StringTest {
	public static void main(String[]args) {
		
/*	String str="ramayan";
	char[]ch=str.toCharArray();

	int n;
	if(ch.length/2==0) {
		n=ch.length/2;
	}
	else
		n=(ch.length/2)+1;
	
	for (int i=0;i<ch.length/2;i++) {
		
		int t=ch[i];
		ch[i]=ch[n+i];
		ch[n+i]=(char) t;
	}
	
	System.out.println("Given Sentence is:"+str);
	System.out.println("Reverse Sentence is:"+new String(ch));//ouput is:yanaram
	*/
		
		//Sort the string
		
		/*String str="bangalore";
		char[]ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i;j<ch.length;j++) { 
			if(ch[i]>='a' && ch[i]<='z') {
				if(ch[i]>ch[j]) {
					char t;
					t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
			
			}
		}
		System.out.println("New String is:"+new String(ch));
	
		*/
		
		
		//Converting the first letter Capital and other to smallest
		
		/*
		String str="saNDeEP";
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ' ) {
				if(ch[i]>='a'&& ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
			}
			else if(ch[i]>='A'&& ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
		}
		
		System.out.println("New String is:"+new String(ch));
		*/
		
		//Occurance of character in a string
		
	/*	
		String str="cuttackkolkatacuttackkolkata";
		char ch[]=str.toCharArray();
		
		Map<Character,Integer> m= new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			if(m.containsKey(ch[i])) {
				m.put(ch[i], m.get(ch[i])+1);
			}
			else
				m.put(ch[i], 1);
		}
		for(Map.Entry<Character,Integer> entry:m.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		*/
		
		//check anagram
		
		/*String s1="keep";
		String s2="peek";
		
		System.out.println(checkAnagram(s1,s2));
	}
	
        private static boolean checkAnagram(String s1,String s2) {
		
		if (s1.length()!=s2.length()) {
			return false ;
		}
		char []ch1=	s1.toCharArray();
		char []ch2=	s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
		
		}

	*/
		/*
		
		//Reverse each word of the sentence
		
		String str="ram and laxmana";
		String revword=" ";
		String []word=str.split("\\s");
		
		for (int i=0;i<word.length;i++) {
			String rev=word[i];
			String reverse=" ";
			for(int j=rev.length()-1;j>=0;j--) {
				reverse=reverse+rev.charAt(j);
			}
			revword=revword+reverse+" ";
		}
		
		System.out.println("Reversing each word of  sentence is"+revword);
		*/
		
		//To reverse a sentence(output-> laxmana and ram)
		
		/*
		String str="ram and laxmana";
		String []word=str.split("\\s");
		String res=" ";
		
		for(int i=word.length-1;i>=0;i--) {
			res=res+word[i]+" ";
		}
			System.out.println("Reverse Sentence is:"+res);
		*/
			
		
		
		
		//Occurance of words in a String
		
		/*
		String str="geek for geeks for now geek geeks for now for geeks now";
		
		Map<String ,Integer> m= new HashMap<>();
		
		String [] word =str.split(" ");
		
		for(String word1:word) {
			
			if(m.get(word1)!=null) {
				m.put(word1, m.get(word1)+1);
		}
			else
				m.put(word1, 1);
		}
		
		for(String str2:word ) {
			if(m.get(str2)>1) {
				System.out.println(str2+"---->"+m.get(str2));
			}
			
		}
		
		*/
		
		/*
		//Sum of alphanumeric
		
		String str="ABC1234";
		char[]ch=str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				sum=sum+(ch[i]-48);
			}
		}
		System.out.println("Sum is:"+sum);
		
		
		/*
		//Count the number of characters present in a string
		
		String str="ABC1234  abvEghjf";
		char[]ch=str.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++) {
             if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' || ch[i]>='0' && ch[i]<='9' || ch[i]!=32 && ch[i]!=',' && ch[i]!=' ') {
				count++;
			}
		}
			System.out.println("Count of character is:"+count);
		
	*/
	
		/*//sorting of characters in a string
		
		String str="bangalore";
		char[]ch=str.toCharArray();
	
		for(int i=0;i<ch.length;i++) {
		for(int j=i;j<ch.length;j++) { 
			if(ch[i]>ch[j]) {
				char t;
				t=ch[i];
				ch[i]=ch[j];
				ch[j]=t;
			}
		}
		}
			System.out.println("Reverse Sentence is:"+new String(ch));
		
		*/
		
	
		// Get the highest length string
		/*
        String[]str= {"sandeepgfdred","igfhgjhj","abvcddffg"};
		
		//Method-1---
		String max=null;
		
		int maxlength=0;
		
		for(String s:str) {
			if(s.length()>maxlength) {
				maxlength=s.length();
				max=s;
			}
		}
		
		System.out.println(max);
		
		//Method-2----
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].length()>str[j].length()) {
					System.out.println(str[i]);
				}
			}
		}
		
		
		
		//Method-3-----
		String[]str1= {"sandeepgfdred","igfhgjhj","abvcddffg"};
		List<String>list=Arrays.asList(str1);
		
		String max1= list.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(max1);
		
		*/
		
		// Coverting String to int type
		
		/*String str ="123";
		
		//method-1
		int parseInt = Integer.parseInt(str);
		System.out.println(parseInt);
		
		//method-2
		char[]ch=str.toCharArray();
		int num=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				 num=num*10+(ch[i]-48);
			}
		}
		
		System.out.println(num);
		
		*/
		
		// To get the unique character from String
		
       /* String str="ABCDABCVHDGRI";
		
		Map<Character,Integer> map= new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else
				map.put(str.charAt(i), 1);
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());;
			}
		}
		
		//Method-2
		for(int i=0;i<str.length();i++) {
			boolean unique=true;
		for (int j = 0; j < str.length(); j++) {
	    if (i != j && str.charAt(i) == str.charAt(j)) {
			unique = false;
		     break;
		   }
		}
		
		if(unique) {
			System.out.println("The first non repeated character in String is: " + str.charAt(i));
		    break;
		}
		}
		
		*/
		
		// Coverting String to Date type
		
		/*
		String str="2021-2-31";
		Date d= new SimpleDateFormat("dd-MM-yyyy").parse(str);
		System.out.println(d);
		*/
		
		// Custom immutable class
		/*
		P p1 = new P(10);
		P p2= p1.modify(100);
		P p3 =p1;
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		*/
		
		
}	
	
}
