package arrayPrograms;

import java.util.Scanner;

public class OddIndexElement {

	//Access all odd index elements from array.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size: ");
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		System.out.println("Enter Array elements: ");
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Element At Odd Indexes: ");
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();

	}

}
