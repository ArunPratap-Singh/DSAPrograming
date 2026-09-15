package conditionalOperator;

import java.util.Scanner;

public class BiggerOfTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter The Number: ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println(n > num ? n : num);
		
		sc.close();

	}

}
