package loop1;

import java.util.Scanner;

public class AddDigit {
	
	//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
				
		while(n >= 10) {
			
			int sum = 0;
			
			while(n > 0) {
				
				int digit = n % 10;
				
				sum = sum + digit;
				
				n/=10;
			}
			
			n = sum;
		}
		System.out.println("Sum of digits until it become single digit is: " +n);
		sc.close();
		

	}

}
