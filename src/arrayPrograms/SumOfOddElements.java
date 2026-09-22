package arrayPrograms;

import java.util.Scanner;

public class SumOfOddElements {

	//Print sum of all odd elements from array.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

        	if(arr[i] % 2 != 0) {
        		sum = sum + arr[i]; 
        	}
            
        }

        System.out.println("Sum Of Odd Elements are = " + sum);
        sc.close();	

	}

}
