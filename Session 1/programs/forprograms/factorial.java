
public class factorial {
	public static void main(String[] args) {
		int i,fact=1;
		int n=5;//for that particular number 5 we want to find the factorial
		
		for (i=1;i<=n;i++) {
			fact =fact*i;
		}
			System.out.println("Factorial of " +n+ " is "+fact);
			
		}
	}


