import java.util.Scanner;

//Write a program to check if the number is positive or negative.
public class PositiveNegative {
	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);  // Created a Scanner object and giving the input from the user
		    System.out.println("Enter Number:");
		    int num = myObj.nextInt();
         if(num > 0) {
    	     System.out.println(num+ "  is positive");
         }
    	     else{
    		 System.out.println(num+ "  is Negative");
    	 }
     }
		
		
		
}
