package arithmaticOperator;

import java.util.Scanner;

public class DifferentTwoDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Last Digit is: " +(n % 10));
		System.out.println("Last Two Digit is: " +(n % 100));
		System.out.println("After Removing Last Digit is: " +(n / 10));
		System.out.println("After Removing Last Two Digit is: " +(n / 100));
		
		sc.close();

	}

}
