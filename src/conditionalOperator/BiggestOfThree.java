package conditionalOperator;

import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Number: ");
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.println((a > b && a > c) ? a : (b > c) ? b : c);
		
		sc.close();

	}

}
