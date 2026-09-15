package mixQues;

import java.util.Scanner;

public class SecondMaxOfThree {
	
	//WAP to find second max of three numbers without using any inbuilt function.


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Third Number: ");
		int c = Integer.parseInt(sc.nextLine());
		
		int max = ((a > b && a > c) ? a : (b > c) ? b : c);
		
		int min = ((a < b && a < c) ? a : (b < c) ? b : c);
		
		int secondMax = a + b + c - max - min;
		
		System.out.println("Second Max Number is: " +secondMax);
		
		sc.close();
		
		

	}

}
