package loop1;

import java.util.Scanner;

public class SubtractProductAndSum {
	
	// Subtract the product and sum of digits of a number.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		int product = 1;
		
		while(n >0) {
			
			int digit = n % 10;
			
			sum = sum + digit;
			
			product = product * digit;
			
			n/=10;
		}
		
		int result = product - sum;
		
		System.out.println("Sum is: " +sum);
		System.out.println("Product is: " +product);
		System.out.println("Difference between " +product+ " and " +sum+ " is: " +result);
		sc.close();

	}

}
