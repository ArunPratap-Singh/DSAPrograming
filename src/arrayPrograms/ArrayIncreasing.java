package arrayPrograms;

import java.util.Scanner;

public class ArrayIncreasing {

	//WAJP to check if an array is strictly increasing.
	//i/p: [2, 3, 7, 8, 9]
	//o/p: Array is strictly increasing
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean increasing = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] >= arr[i + 1]) {
                increasing = false;
                break;
            }
        }
        //This Array is also called as monotonic array 
        if (increasing) {
            System.out.println("Array is strictly increasing");
        } else {
            System.out.println("Array is not strictly increasing");
        }
        sc.close();

	}

}
