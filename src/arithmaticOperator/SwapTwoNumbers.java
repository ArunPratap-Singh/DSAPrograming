package arithmaticOperator;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Second Number: ");
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
