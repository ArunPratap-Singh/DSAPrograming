package conditionalOperator;

import java.util.Scanner;

public class ThreeSidesOfATriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Side: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Side: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Third Side: ");
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.println((a+b)>c && (b+c)>a && (a+c)>b?"Triangle is Valid":"Traingle Is Not Valid");
		
		sc.close();
	}

}
