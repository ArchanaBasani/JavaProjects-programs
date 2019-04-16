

public class ReverseDigit {

	public static void main(String[] args) {
		int r=0;
		int n=12345;
		
		do{
		   
			int d=n%10;
			r=r*10+d;
			 n=n/10;
			
		}while(n!=0);
 System.out.println("Reversed Digits: " + r);

	}

}
