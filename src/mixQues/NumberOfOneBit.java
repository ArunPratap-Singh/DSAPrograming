package mixQues;

import java.util.Scanner;

public class NumberOfOneBit {

	public static void main(String[] args) {
	
		//Number of 1 Bits or Number of set Bits

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		while(n > 0) {
			
			if(n % 2 == 1) {
				count++;
			}
			n/=2;
		}
		System.out.println("Number of set Bits or Hamming Weight (1's) is: " +count);
		sc.close();
	}
	


}
