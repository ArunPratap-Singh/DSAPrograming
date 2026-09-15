package loop1;

import java.util.Scanner;

public class ReverseTheNumber {

	//Write a java program to take a user input and reverse the number.
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int reverse = 0;
		
		while(n > 0) {
			
			int digit = n % 10;
			
			reverse = reverse*10 + digit;
			
			n/=10;
		}
		System.out.println("Reverse Number is: " +reverse);
		sc.close();

	}

}
