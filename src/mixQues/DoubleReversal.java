package mixQues;

import java.util.Scanner;

public class DoubleReversal {

	//A Number After a Double Reversal

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int temp = n;
		int reverse1 = 0;
		int reverse2 = 0;
		
		while(n > 0) {
			int digit = n % 10;
			reverse1 = reverse1*10 + digit;
			n/=10;
		}
		
		int original = reverse1;
		while(original > 0) {
			
			int digit = original % 10;
			reverse2 = reverse2*10 + digit;
			
			original/=10;
		}
		if(temp == reverse2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		System.out.println("Number after second reverse is: " +reverse2);
		sc.close();

	}

}
