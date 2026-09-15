package loop1;

import java.util.Scanner;

public class CountDigitThatDivideNo {
	
	//Given an integer num, return the number of digits in num that divide num.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int original = n;
		int count = 0;
		
		while(n > 0) {
			
			int digit = n % 10;
			
			if(digit != 0 && original % digit ==0) {
				count++;
			}
			n/=10;
		}
		System.out.println("Number of digit that divide a number is: " +count);
		sc.close();

	}

}
