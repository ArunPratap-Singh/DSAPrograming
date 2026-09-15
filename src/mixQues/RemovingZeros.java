package mixQues;

import java.util.Scanner;

public class RemovingZeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		long n = Long.parseLong(sc.nextLine());
		
		long result = removeZeros(n);
		
		System.out.println("Original Number is: " +n);
		System.out.println("Number after Removing zeros is: " +result);
		sc.close();
		
		
	}
	
	public static long removeZeros(long n) {
		
		long result = 0;
		long place = 1;
		
		while(n > 0) {
			
			long digit = n % 10;
			
			if(digit != 0) {
			result = result + digit * place;
			place = place*10;
			}
			
			n/=10;
		}
		return result;
	}

}
