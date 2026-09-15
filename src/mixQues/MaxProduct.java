package mixQues;

import java.util.Scanner;

public class MaxProduct {

	//Maximum Product of Two Digits
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int maxproduct = 0;
		
		while(n > 0) {
			
			int digit1 = n  % 10;
			
			n/=10;
			
			int temp = n;
			
			while(temp > 0) {
				
				int digit2 = temp % 10;
				
				int product = digit1 * digit2;
				
				if(product > maxproduct) {
					maxproduct = product;
				}
				temp/=10;
			}
			System.out.println("Maximum product of two digit is: " +maxproduct);
			sc.close();
		}

	}

}
