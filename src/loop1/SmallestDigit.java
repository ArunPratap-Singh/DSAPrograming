package loop1;

import java.util.Scanner;

public class SmallestDigit {
	
	//Write a java program to take a user input and print the smallest digit of the number.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int smallest = 10;
		while(n > 0) {
			
			int digit = n % 10;
			
			if(digit < smallest) {
				
				smallest = digit;
			}
			n/=10;
		}
		System.out.println("Smallest Digit is: " +smallest);
		sc.close();
	}

}
