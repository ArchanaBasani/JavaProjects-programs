
public class ReverseDigit {

	public static void main(String[] args) {
		int r=0;
		int n=12345;
		for(;n!=0;  n= n/10){
		 
			int d=n%10;
			
			r=r*10+d;
			
		}
 System.out.println("Reversed Digits: " + r);
	}

}

