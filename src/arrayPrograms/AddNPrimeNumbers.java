package arrayPrograms;

import java.util.Scanner;

public class AddNPrimeNumbers {

	//WAJP to store n prime numbers in array. [Very Important]
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
		
		System.out.println("How many prime number you want to add: ");
		int n = sc.nextInt();
		
		int[] arr = new int [n];
		
		int number = 2;
		int index = 0;
		
		while(index < n) {
			
			if(isPrime(number)) {
				arr[index] = number;
				index++;
			}
			number++;
		}
		
		System.out.println("Prime Number Stored in Array are: ");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i] + " ");
		}
		sc.close();
	}

}
