package arithmaticOperator;

import java.util.Scanner;

public class SwapThreeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Third Number: ");
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.println("Number Before Swapping");
		System.out.println("A is: " +a);
		System.out.println("B is: " +b);
		System.out.println("C is: " +c);
		
		int temp = a;
		 	a = c;
		 	c = b;
		 	b = temp;
		 	
	 	System.out.println("Number After Swapping");
		System.out.println("A is: " +a);
		System.out.println("B is: " +b);
		System.out.println("C is: " +c);
		
		sc.close();
	 	
		 	
		 	
		

	}

}
