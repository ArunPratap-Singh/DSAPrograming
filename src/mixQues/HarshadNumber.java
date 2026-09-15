package mixQues;

import java.util.Scanner;

public class HarshadNumber {
	
	//An integer divisible by the sum of its digits is said to be a Harshad number. 
	//You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.
	//Harshad Number

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int temp = n;
		int sum = 0;
		while(n > 0) {
			
			int digit = n %10;
			
			sum = sum + digit;
			
			n/=10;
		}
		if (sum != 0 && temp % sum == 0) {
            System.out.println("Harshad Number");
            System.out.println("Sum of digits = " + sum);
        } else {
            System.out.println("Not a Harshad Number");
            System.out.println("Output = -1");
        }
		sc.close();

	}

}
