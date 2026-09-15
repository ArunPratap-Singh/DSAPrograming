package conditionalOperator;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Year: ");
		int year = Integer.parseInt(sc.nextLine());
		
		System.out.println((year % 400 == 0)?  true  : (year % 100 == 0)?  false  : (year % 4 == 0)?  true  : false );
		
		sc.close();

	}

}
