package arrayPrograms;

import java.util.Scanner;

public class PrintElementsFromEnd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size: ");
		
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		System.out.println("Enter Array Elements: ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("All Elements From Ends are: ");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
