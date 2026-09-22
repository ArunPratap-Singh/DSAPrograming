package arrayPrograms;

import java.util.Scanner;

public class ElementsBiggerThanAverage {

	//WAJP to print and count all the elements of array which are bigger than average value.
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

        double average = (double) sum / arr.length;

        int count = 0;

        System.out.println("Average = " + average);

        System.out.println("Elements bigger than average:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > average) {

                System.out.println(arr[i]);
                count++;
            }
        }

        System.out.println("Count = " + count);
        sc.close();
	}

}
