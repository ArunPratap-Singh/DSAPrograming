package arrayPrograms;

import java.util.Scanner;

public class CountThreeDigit {

	//print and count all three-digit numbers from array.
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        System.out.println("Three-digit numbers:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 100 && arr[i] <= 999) {

                System.out.println(arr[i]);
                count++;
            }
        }

        System.out.println("Three-digit numbers are = " + count);
        sc.close();
	}

}
