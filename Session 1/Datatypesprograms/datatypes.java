//Write programs to use all the data types and given arithmetic operation
public class datatypes {

	public static void main(String[] args) {
		//created a byte variable and initialized it with 10
		byte b = 10;
		//created a int variable and initialized it with 20;
		int i = 20;
		//created a short variable and initialized it to 30;
		short s = 30;
		//created a long variable and initialized it to 3000;
		long l=3000;
		//created a float variable and initialized it to 50.5;
		float f= 50.5f;
		//created a double variable and initialized it to 1000.5;
		double d= 1000.5;
		//created a character variable and initialized it to a;
		char c='a';
		//created a boolean variable and initialized it to false;
		boolean bl=false;
		//1.Addition operation
		System.out.println("Addition: "+(b+s));
		//2.Subtraction operation
		System.out.println("Subtraction: "+(d-f));
		//3.Multiplication operation
		System.out.println("Mutliplication: "+(l*i));
		//4.Division operation
		System.out.println("Division: "+(d/i));
		//5.Increment operator
		System.out.println("Increment: "+(i++ + ++s));
		//6.Decrement operator
		System.out.println("Decrement: "+(d-- + --f ));
		//printing the character and boolean
		System.out.println("Character " + c +" "+"is equal to b:"+bl);
		
	
		
		
		
		
	}

}