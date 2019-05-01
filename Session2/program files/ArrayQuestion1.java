package com.edureka.assignment2;


import java.util.Scanner;


public class ArrayQuestion1{
	
	//Displays the arrays.
	void display(int id[], double salary[], String name[] )
	{
		
		System.out.println("ID            Name          Salaray");
		
		int length = id.length;
		for (int i=0; i < length; ++i)
		{
			System.out.println(id[i] + "             " + name[i] + "          " + salary[i]);
		}
		
		
	}
	
	
	
	
	public static void main (String args[])
	{
		int id[] = new int[5];
		double salary[] = new double[5];
		String name[] = new String[5];
		
		//Accepting data...
	 
		Scanner sc = new Scanner (System.in);
		 
		
 
	for (int i = 0;  i < 5; ++i)
	{
	   System.out.println("Enter employee record in ID Name salaray format...");
		id[i] = sc.nextInt();
		name[i]= sc.next();
		salary[i] = sc.nextDouble();
	}
		
		
		ArrayQuestion1 m1 = new ArrayQuestion1();
		m1.display(id, salary, name);
		System.out.println();
		
		
		
		
	}

}
