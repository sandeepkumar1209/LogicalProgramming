package com.Java;

import java.io.*;

public class FileTest {

	public static void main(String[] args) throws Exception {
		
		// To read character data from file
		/*
		FileReader fr =new FileReader("pqr.txt"); 
		BufferedReader br =new BufferedReader(fr);
		String line = br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		*/
		
		//To write character data 
		/*
		FileWriter fw=new FileWriter("pqr.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write(100);
		bw.newLine();
		
		char[] ch= {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();

		bw.write("ricky");
		bw.newLine();
		
		bw.write("software solutions");
		bw.newLine();
		
		bw.flush();
		bw.close();
*/
		
		// Use of printwriter
		/*
		FileWriter fr= new FileWriter("abc.txt");
		PrintWriter pw = new PrintWriter(fr);
		
		pw.println(100);
		pw.write(100);
		pw.println(true);
		pw.println('c');
		pw.println("durga");
		pw.flush();
		pw.close();
		*/
		
		//Merge two files into a single file
		
		/*PrintWriter pw = new PrintWriter("xyz.txt");
		
		BufferedReader br1 =new BufferedReader(new FileReader("pqr.txt"));
		String line1 = br1.readLine();
		
		BufferedReader br2 =new BufferedReader(new FileReader("abc.txt"));
		String line2 = br2.readLine();
		
		
		while((line1!=null) || (line2!=null) ) {
			if(line1!=null){
			pw.println(line1);
			line1=br1.readLine();
		}
		
		if(line2!=null) {
			pw.println(line2);
			line2=br2.readLine();
		}
		}
		
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
		*/
		
		// Remove duplicates from given input file
		
		/*PrintWriter pw = new PrintWriter("output.txt");
		BufferedReader br1 =new BufferedReader(new FileReader("input.txt"));
		
        String line = br1.readLine();
		
		while(line!=null) {
			boolean available=false;
			
			BufferedReader br2 =new BufferedReader(new FileReader("output.txt"));
			String target = br2.readLine();
			
			while(target!=null) {
			if(line.equals(target)) {
				available=true;
				break;
			}
			target=br2.readLine();
			}
			if(available==false) {
				pw.println(line);
				pw.flush();
			}
			line=br1.readLine();
		}
		
		br1.close();
		pw.close();
		
		*/
		
		
		
	}


}
