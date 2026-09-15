package mixQues;

import java.util.Scanner;

public class FactorialTrailingZeros {

	//Factorial Trailing Zeroes

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int count= 0;
		while(n > 0) { // we can also write while(n > 4) because till 4 no 5 come so no zero as number of 5 = tailing zeros 
			
			count+= n/5;
			
			n/=5;
		}
		
		System.out.println("Number of Trailing Zero's are: " +count);
		sc.close();

	}

}
