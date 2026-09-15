package mixQues;

import java.util.Scanner;

public class MaxOfThree {
	
	//WAP to find max of three numbers without using any inbuilt function.


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Third Number: ");
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.println((a > b && a > c) ? a : (b > c) ? b : c);
		
		sc.close();

	}

}
