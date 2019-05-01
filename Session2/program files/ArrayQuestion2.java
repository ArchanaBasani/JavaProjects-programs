package com.edureka.assignment2;

import java.util.Scanner;
public class ArrayQuestion2 {
	//Displays the arrays.
		void display(int id[], String name[] )
		{
			
			System.out.println("ID            Name   ");
			
			int length = id.length;
			for (int i=0; i < length; ++i)
			{
				System.out.println(id[i] + "            " + name[i] + "        ");
			}	
			
		}
		
			public static void main (String args[]) {
		
			int id[] = new int[5];
			
			String name[] = new String[5];
			
			//Accepting data...
		 
			Scanner sc = new Scanner (System.in);
			 
			
	 
		for (int i = 0;  i < 5; ++i)
		{
		   System.out.println("Enter employee record in ID Name format...");
			id[i] = sc.nextInt();
			name[i]= sc.next();
			
		}
			
			
			ArrayQuestion2 m1 = new ArrayQuestion2();
			
			
			m1.display(id, name);
			System.out.println();
		}

}