package arrayPrograms;

import java.util.Scanner;

public class BiggestSmallestElements {

	//Print Biggest and Smallest Element of Array.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int biggest = arr[0];
        int smallest = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
        	
        	if(arr[i] > biggest) {
        		biggest = arr[i];
        	}
        	
        	if(arr[i] < smallest) {
        		smallest = arr[i];
        	}
        }
        System.out.println("Biggest Element is: " +biggest);
        System.out.println("Smallest Element is: " +smallest);
        sc.close();
	}

}
