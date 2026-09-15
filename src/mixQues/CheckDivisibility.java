package mixQues;

import java.util.Scanner;

public class CheckDivisibility {

	//Check Divisibility by Digit Sum and Product

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int temp = n;
		int sum = 0;
		int product = 1;
		
		while(n > 0) {
			
			int digit = n % 10;
			sum = sum + digit;
			product = product * digit;
			
			n/=10;
		}
		
		int result = product + sum;
		System.out.println("Product is: " +product);
		System.out.println("Sum is: " +sum);
		System.out.println("Result is: " +result);
		if(temp % result == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		sc.close();

	}

}
