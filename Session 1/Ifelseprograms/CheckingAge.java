//Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)
import java.util.Scanner; //used to import scanner class
public class CheckingAge {

	public static void main(String[] args) {
		// int age=35; initializing the int with a given age 
		 Scanner myObj = new Scanner(System.in);  // Created a Scanner object and giving the input from the user
		    System.out.println("Enter Age:");
		    int age = myObj.nextInt(); //storing the given input to age 
		 if(age>=18) {
			 System.out.println("Candidate is eligible for voting");
		 }else{
			 System.out.println("Candidate is not eligible for voting");
		 }

	}

}
