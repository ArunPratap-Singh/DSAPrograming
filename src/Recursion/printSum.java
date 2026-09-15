package Recursion;

public class printSum {

	public static int findSum(int n) {

		if (n > 100) {
			return 0;
		}

		return n + findSum(n + 1);
	}

	public static void main(String[] args) {

		System.out.println("===Main Method Start===");
		int result = findSum(1);

		System.out.println("Sum of numbers from 1 to 100 is: " + result);
		
		System.out.println("===Main Method Ends===");
	}

}
