package mixQues;

import java.util.Scanner;

public class MaxOfTwo {
	
	//WAP to find max of two numbers without using any inbuilt function.


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Second Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println(a > b ? a : b);
		
		sc.close();
 
	}

}
