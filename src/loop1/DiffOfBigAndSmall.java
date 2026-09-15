package loop1;

import java.util.Scanner;

public class DiffOfBigAndSmall {
	
	//Write a java program to take a user input and print the difference of biggest digit and smallest digit of the number.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int biggest = 0;
		int smallest = 10;
		
		while(n > 0) {
			
			int digit = n % 10;
			
			if(digit > biggest) {
				
				biggest = digit;
			}
			
			if(digit < smallest) {
				
				smallest = digit;
			}
			n/=10;
		}
		
		int difference = biggest - smallest;
		
		System.out.println("Biggest Value is: " +biggest);
		System.out.println("Smallest Value is: " +smallest);
		System.out.println("difference between " +biggest+ " and " +smallest+ " is: " +difference);
		
		sc.close();

	}

}
