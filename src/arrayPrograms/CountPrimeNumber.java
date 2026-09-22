package arrayPrograms;

import java.util.Scanner;

public class CountPrimeNumber {

	//WAJP to count all prime numbers available in array.
	
		public static boolean isPrime(int n) {

	        if (n < 2) {
	            return false;
	        }

	        for (int i = 2; i <= n / 2; i++) {

	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("Prime numbers:");

        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) 
            	count++;
      
        }	
        System.out.println("Count of prime numbers = " + count);
        sc.close();

	}

}
