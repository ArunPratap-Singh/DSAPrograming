package mixQues;

import java.util.Scanner;

public class ConcatToNonZeroAndMultiplyBySum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		long n = Long.parseLong(sc.nextLine());
		
		long result = multiplyNonZeroDigits(n);
		
		System.out.println("Original Number is: " +n);
		System.out.println("Result of Sum * number of number After removinbg zeros is: " +result);
		sc.close();

	}
	
	public static long multiplyNonZeroDigits(long n) {
		
		long sum = 0;
		long number = 0;
		long place = 1;
		
		while(n > 0) {
			
			long digit = n % 10;
			
			if(digit != 0) {
				
				number = number + digit * place;
				place = place * 10;
				sum = sum + digit;
			}
			n/=10;
		}
		return number * sum;
	}

}
