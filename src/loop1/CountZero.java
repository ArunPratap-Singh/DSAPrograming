package loop1;

import java.util.Scanner;

public class CountZero {
	
	//Write a java program to take a user input and count how many 0 digit is in number.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		
		while(n > 0) {
			
			int digit = n % 10;
			
			if(digit == 0) {
				count++;
			}
		n/=10;	
		}
		System.out.println("Total Zero count is: " +count);
		sc.close();
		
	}

}
