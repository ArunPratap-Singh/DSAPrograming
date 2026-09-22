package arrayPrograms;

import java.util.Scanner;

public class CountPalindrome {

	//WAJP to count all palindrome numbers available in array.
	
	public static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;
        }

        return original == reverse;
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size: ");
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		System.out.println("Enter Array Element: ");
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		System.out.println("Palindrome numbers:");

        for (int i = 0; i < arr.length; i++) {

            if (isPalindrome(arr[i])) {
            	count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("Total Palindrome Numbers are: " +count);
        sc.close();

	}

}
