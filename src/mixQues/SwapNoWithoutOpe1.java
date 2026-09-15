package mixQues;

import java.util.Scanner;

public class SwapNoWithoutOpe1 {
	
	//WAP to swap two numbers without using a third variable or without using +, –, * or / operator.


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Number : ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Number Before Swapping");
		System.out.println("A is: " +a);
		System.out.println("B is: " +b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("Number After Swapping");
		System.out.println("A is: " +a);
		System.out.println("B is: " +b);
		
		sc.close();

	}

}
