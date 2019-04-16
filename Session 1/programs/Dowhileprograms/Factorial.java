

public class Factorial {

	public static void main(String[] args) {
		int i=1,fact=1;
		int n=5;//for that particular number 5 we want to find the factorial
		
		 do{
			fact =fact*i;
			i++;
		}while(i<=n);
			System.out.println("Factorial of " +n+ " is "+fact);

	}

}

