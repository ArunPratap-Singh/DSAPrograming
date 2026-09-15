package conditionalOperator;

import java.util.Scanner;

public class CheckingFactor {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Divisor: ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.println(x % y == 0?" y is a factor of x " : " y is not a factor of x ");
		
		sc.close();
	}

}
