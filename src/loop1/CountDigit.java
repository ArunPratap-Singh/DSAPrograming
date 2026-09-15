package loop1;

import java.util.Scanner;

public class CountDigit {
	
	//Write a java program to take a user input and count the total digit of the number.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		
		while(n > 0) {
			 int digit = n % 10;
			 count++;
			 
			 n/=10;
		}
		System.out.println("Total digit is: " +count);
		sc.close();

	}

}
