package arrayPrograms;

import java.util.Scanner;

public class CountOddElements {

	//count all odd elements from array.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size: ");
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		System.out.println("Enter Array Elements: ");
		 for(int i = 0; i < arr.length; i++) {
			 
			 arr[i] = sc.nextInt();
		 }
		 
		 int count = 0;
		 System.out.println("Odd Elements Are: ");
		 
		 for(int i = 0; i < arr.length; i++) {
			   
			if(arr[i] % 2 != 0) {
				count++;
				System.out.println(arr[i]);
			}
		 }
		 System.out.println("Total odd Elements Are: " +count);
		 sc.close();

	}

}
