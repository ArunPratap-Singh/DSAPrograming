package loop1;

import java.util.Scanner;

public class MirrorDistance {
	
	//Define its mirror distance as: abs(n - reverse(n))​​​​​​​ where reverse(n) is the integer formed by reversing the digits of n.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int reverse = 0;
		int Original = n;
		
		while(n > 0) {
			
			int digit = n % 10;
			
			reverse = reverse*10 + digit;
			
			n/=10;
			
		}
		
		int difference = Original - reverse;
		
		if(difference < 0) {
			
			difference = -difference;
		}
		
		System.out.println("Original Number is: " +n);
		System.out.println("Reverse number is: " +reverse);
		System.out.println("Mirror distance is: " +difference);
		sc.close();

	}

}
