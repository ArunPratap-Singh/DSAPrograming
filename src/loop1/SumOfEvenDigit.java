package loop1;

import java.util.Scanner;

public class SumOfEvenDigit {
	
	//Write a java program to take a user input and print the sum of each even digits of the number.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		
		while(n > 0) {
			 int digit = n % 10;
			 
			 if(digit % 2 == 0) {
				 
				 sum = sum + digit;
			 }
			 n/=10;
		}
		System.out.println("Sum of each Even digit is: " +sum);
		sc.close();

	}

}
