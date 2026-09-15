package mixQues;

import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer

public class SubtractSumAndProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		int product = 1;
		
		while(n > 0) {
			
			int digit = n % 10;
			sum = sum + digit;
			product = product * digit;
			
			n/=10;
		}
		int Result = product - sum;
		System.out.println("Product is: " +product);
		System.out.println("Sum is: " +sum);
		System.out.println("Result is: " +Result);

		sc.close();
	}

}
