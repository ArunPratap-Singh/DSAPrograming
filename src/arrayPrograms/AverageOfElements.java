package arrayPrograms;

import java.util.Scanner;

public class AverageOfElements {

	//Print Average of all elements from array.
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

            sum = sum + arr[i];
        }
        
        double average = (double)sum/arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        sc.close();
	}

}
