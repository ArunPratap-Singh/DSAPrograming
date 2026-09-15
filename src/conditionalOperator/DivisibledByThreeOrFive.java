package conditionalOperator;

import java.util.Scanner;

public class DivisibledByThreeOrFive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println((n % 3 == 0 && n % 5 == 0) ? "Divisible By Both 3 and 5" : (n % 3 == 0)?"Divisible By 3" : (n % 5 == 0)?"Divisible by 5":"None");
		
		sc.close();
	}
}
