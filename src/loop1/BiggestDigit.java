package loop1;

import java.util.Scanner;

public class BiggestDigit {
	
	//Write a java program to take a user input and print the biggest digit of the number.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int Biggest = 0;
		while(n > 0) {
			
			int digit = n % 10;
			
			if(digit > Biggest) {
				
				Biggest = digit;
			}
			n/=10;
		}
		System.out.println("Biggest Digit is: " +Biggest);
		sc.close();

	}

}
