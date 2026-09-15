package loop1;

import java.util.Scanner;

public class SumOffDigitLessOrEqual {
	
	//Write a java program to take a user input and print the sum of each digits of the number which are less than or equal to 5.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		
		while(n > 0) {
			
			int digit  = n % 10;
			
			if(digit <= 5) {
				sum = sum + digit;
			}
			n/=10;
		}
		System.out.println("Sum of digit less than or equal to 5 are: " +sum);
		sc.close();
	}

}
