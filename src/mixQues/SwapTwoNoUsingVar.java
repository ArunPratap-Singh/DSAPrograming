package mixQues;

import java.util.Scanner;

public class SwapTwoNoUsingVar {
	
	//WAP to swap two numbers using a third variable.

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Number Before Swapping");
		System.out.println("A is: " +a);
		System.out.println("B is: " +b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Number After Swapping");
		System.out.println("A is: " +a);
		System.out.println("B is: " +b);
		
		sc.close();
	}

}
