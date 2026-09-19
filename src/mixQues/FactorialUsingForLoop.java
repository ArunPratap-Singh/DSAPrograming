package mixQues;

public class FactorialUsingForLoop {

	public static void main(String[] args) {
		
		int n = 10;
		long fact = getFactorial(n);
		System.out.println(fact);

	}
	
	public static long getFactorial(int n) {
		
		int fact = 1;
		
		for(int i = 1; i <= n; i++) {
			
			fact = fact * i;
		}
		return fact;
	}

}
