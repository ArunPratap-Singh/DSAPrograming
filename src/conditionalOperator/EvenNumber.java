package conditionalOperator;

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println(n%2==0?"Even Number":"Odd Number");
		
		sc.close();
	}

}
