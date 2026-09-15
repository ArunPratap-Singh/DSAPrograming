package mixQues;

import java.util.Scanner;

public class NumberOfStepsReduceToZero {

	//Number of Steps to Reduce a Number to Zero
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		while(n > 0) {
			
			if(n % 2 == 0) {
				
				n /=2;
			}else {
			n= n-1;
			}
			count++;
		}
		System.out.println("Number of Steps needed To Reduce to zero is: " +count);
		sc.close();

	}

}
