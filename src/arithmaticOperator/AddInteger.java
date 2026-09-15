package arithmaticOperator;

import java.util.Scanner;

public class AddInteger {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		int result = a + b;
		
		System.out.println("Sum of " +a+ " and " +b+ " is: " +result);
		
		sc.close();
	}

}
