package arrayPrograms;

import java.util.Scanner;

public class LargestString {

	//For the given array of Strings, print the largest string.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size: ");
		int n = sc.nextInt();
		
		String [] arr = new String [n];
		
		System.out.println("Enter Array Elements: ");
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextLine();
		}
		
		 String largest = arr[0];

	        for (int i = 1; i < arr.length; i++) {

	            if (arr[i].length() > largest.length()) {
	                largest = arr[i];
	            }
	        }

	        System.out.println("Largest String = " + largest);
	        System.out.println("Length = " + largest.length());
	        sc.close();

	}

}
