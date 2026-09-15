package mixQues;

import java.util.Scanner;

public class CountDigitOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		while(num > 0) {
			int digit = num & 10;
			count++;
			
			num/=10;
		}
		System.out.println("Total Digits Are: " +count);
		sc.close();

	}

}
