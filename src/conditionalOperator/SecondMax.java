package conditionalOperator;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Number: ");
		int c = Integer.parseInt(sc.nextLine());
		
		int max = ((a > b && a > c) ? a : (b > c) ? b : c);
		
		int min = ((a < b && a < c) ? a : (b < c) ? b : c);
		
		int secondMax = a + b + c - max - min ;
		
		System.out.println(secondMax);
		
		sc.close();
		
		

	}

}
