package mixQues;

import java.util.Scanner;

public class BiggestNumAndPrintEqual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Third Number: ");
		int c = Integer.parseInt(sc.nextLine());
		
		if(a == b && b == c) {
			System.out.println("All are Equals");
		}else if(a >= b && a >= c) {
			System.out.println("Biggest Number is: " +a);
		}else if(b >= a && b >=c) {
			System.out.println("Biggest Number is: " +b);
		}else {
			System.out.println("Biggest Number is: " +c);
		}
		
		sc.close();
		
		

	}

}
