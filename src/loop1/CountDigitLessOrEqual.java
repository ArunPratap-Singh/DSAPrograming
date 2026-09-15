package loop1;

import java.util.Scanner;

public class CountDigitLessOrEqual {
	
	//Write a java program to take a user input and count all the digits of the number which are less than or equals to 5.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		
		while(n > 0) {
			
			int digit = n %10;
			
			if(digit <= 5) {
				count++;
			}
			n/=10;
		}
		System.out.println("Total Digit less or equal to 5 are: " +count);
		sc.close();

	}

}
