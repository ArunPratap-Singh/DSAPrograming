package mixQues;

import java.util.Scanner;

//Add Digits

public class AddDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		while(n > 9) {
			int sum = 0;
			
			while(n > 0) {
				
				int digit = n % 10;
				sum = sum + digit;
				
				n/=10;
			}
			n = sum;
		}
		System.out.println("Sum of Single Digit is: " +n);
		sc.close();

	}

}
