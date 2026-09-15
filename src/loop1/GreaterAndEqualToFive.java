package loop1;

import java.util.Scanner;

public class GreaterAndEqualToFive {
	
	//Write a java program to take a user input and print each digits of the number which are greater than or equals to 5 one by

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		while(n > 0) {
			
			int digit = n % 10;
			
			if(digit >= 5) {
				
				System.out.println(digit);
			}
			n/=10;
		}
		sc.close();

	}

}
