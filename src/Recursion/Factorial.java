package Recursion;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("===Main Method Starts===");
		int result = findFactorial(5);
		System.out.println("Factorial of 5 is: " +result);
		System.out.println("===Main Method Ends===");

	}
	
	public static int findFactorial(int n) {
		if(n==1) {
			return 1;
		}
		
		return n* findFactorial(n-1);
	}

}
