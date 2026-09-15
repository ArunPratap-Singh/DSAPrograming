package Recursion;

public class PrintSumOfSquares {

	public static void main(String[] args) {
		
		System.out.println("===Main Method Starts===");
		int result = findSum(1);
		System.out.println("Sum of squares of 1 to 100 is: " +result);
		System.out.println("===Main Method Ends");
	}
	
	public static int findSum(int n) {
		
		if(n>100) {
			return 0;
		}
		
		return n*n + findSum(n+1);
	}

}
