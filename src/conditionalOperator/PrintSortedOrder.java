package conditionalOperator;

import java.util.Scanner;

public class PrintSortedOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Number: ");
		int c = Integer.parseInt(sc.nextLine());
		
		int smallest = ((a < b && a < c) ? a : (b < c) ? b : c);
		
		int biggest = ((a > b && a > b) ? a : (b > c) ? b : c);
		
		int middle = a + b + c - biggest - smallest;
		
		System.out.println("Number In Ascending Order");
		System.out.println(smallest+ " " +middle+ " " +biggest);
		
		sc.close();

	}

}
