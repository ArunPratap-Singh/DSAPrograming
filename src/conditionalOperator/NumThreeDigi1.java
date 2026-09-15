package conditionalOperator;

import java.util.Scanner;

public class NumThreeDigi1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println(n>=100 && n<=999?n+" n is a 3 digit Number":n+" is Not a 3 digit number");
		
		sc.close();

	}

}
