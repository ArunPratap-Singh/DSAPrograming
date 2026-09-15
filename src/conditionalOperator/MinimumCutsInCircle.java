package conditionalOperator;

import java.util.Scanner;

public class MinimumCutsInCircle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Equal Parts: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println((n == 1) ? 0 : (n % 2 == 0) ? n / 2 : n);
		
		sc.close();
	}

}
