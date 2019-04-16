import java.util.Scanner;
//Extend the previous program to check whether the given number is positive, zero or negative.(Hint: use if-else conditions)
public class PosNegZer {
 
	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);  // Created a Scanner object and giving the input from the user
		    System.out.println("Enter Number:");
		    int num = myObj.nextInt();
        if(num == 0) {
   	     System.out.println(num+ "  is Zero");
        }
   	     else if(num < 0){
   		 System.out.println(num+ "  is Negative");
   	     } else if(num > 0) {
   		 System.out.println(num+ " is Positive");
   	 }
    }
		
		
		
}
