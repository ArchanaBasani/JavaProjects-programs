import java.util.Scanner;

//Write a program to find largest of two numbers.
public class larnum {
	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);  // Created a Scanner object and giving the input from the user
		    System.out.println("Enter a:");
		    int a = myObj.nextInt();
		    Scanner myObj1 = new Scanner(System.in);  // Created a Scanner object and giving the input from the user
		    System.out.println("Enter b:");
		    int b = myObj1.nextInt();
		    
		    
       if(a>b) {
  	     System.out.println(a+ "  is greater than "+b);
       }
  	     else if(a < b){
  		 System.out.println(b+ "  is greater than " +a);
  	     } else if(a == b) {
  		 System.out.println(a + " is equal to " +b);
  	 }
   }

}
