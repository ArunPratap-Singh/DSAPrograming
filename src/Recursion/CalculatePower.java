package Recursion;

public class CalculatePower {

	public static void main(String[] args) {
		
		System.out.println("===Main Method Starts===");
		int result = findPower(2, 5);
		System.out.println("Factorial is: " +result);
		System.out.println("===Main Method Ends===");

	}
	
	public static int findPower(int base, int exponent) {
		
		if(exponent==0) {
			return 1;
		}
		
		return base * findPower(base, exponent-1);
	}

}
