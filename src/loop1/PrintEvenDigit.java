package loop1;

import java.util.Scanner;

public class PrintEvenDigit {
	
	//Write a java program to take a user input and print each even digits of the number one by one.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		while(n > 0) {
			
			int digit = n % 10;
			
			if(digit % 2 == 0) {
				
				System.out.println(digit);
			}
			n/=10;
		}
		
		sc.close();

	}

}
