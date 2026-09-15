package loop1;

import java.util.Scanner;

public class NumberOfStepsReduceToZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int steps = 0;
		
		while(n != 0) {
			
			if(n % 2 == 0) {
				
				n/=2;
			}else {
				n = n - 1;
			}
			steps++;
		}
		System.out.println("Number Of Steps To Reduce To Zero is: " +steps);
		sc.close();

	}

}
