package arithmaticOperator;

import java.util.Scanner;

public class PrintDigitFFromLastTwoDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println(n % 10);
		n = n/10;
		
		System.out.println(n % 10);
		n = n/10;
		
		System.out.println(n % 10);
		n = n/10;
		
		System.out.println(n % 10);
		n = n/10;
		
		System.out.println(n % 10);
		n = n/10;
		
		sc.close();

	}

}
