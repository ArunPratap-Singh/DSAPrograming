package loop1;

import java.util.Scanner;

public class CheckPalindrome {
	
	//Given an integer x, return true if x is a palindrome, and false otherwise.

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int num = n;
		int reverse = 0;
		
		while(n > 0) {
			
			int digit = n % 10;
			
			reverse = reverse*10 +digit;
			
			n/=10;
			
		}
		
		if(reverse == num) {
			System.out.println("Is A Palindrom");
		}else {
			System.out.println("Not A Palindrome");
		}
		sc.close();

	}

}
