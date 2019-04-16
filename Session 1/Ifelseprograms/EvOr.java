import java.util.Scanner;

public class EvOr {
	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);  // Created a Scanner object and giving the input from the user
		    System.out.println("Enter a:");
		    int a = myObj.nextInt();
		    
		    if (a%2 == 0) {
		    	System.out.println(a+ " is even");
		    }else {
		    	System.out.println(a+ "  is odd");
		    }
}
}

