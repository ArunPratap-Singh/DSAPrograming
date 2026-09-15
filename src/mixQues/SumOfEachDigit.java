package mixQues;

import java.util.Scanner;

//WAP to get the sum of each digits of the number.

public class SumOfEachDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		
		while(n > 0) {
			
			int digit = n %10;
			sum = sum + digit;
			
			n/=10;
		}
		System.out.println("Total sum number is: " +sum);
		sc.close();

	}

}
