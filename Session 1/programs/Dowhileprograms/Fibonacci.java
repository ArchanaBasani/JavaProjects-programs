

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int i=1;
		 do{
			System.out.println(n1+"");
			int sum = n1+n2;
			n1 = n2;
			n2 = sum;
			i++;
		}while(i<=10);
			

	}

}
