package mixQues;

import java.util.Scanner;

public class MirrorDistance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int temp = n;
		int reverse = 0;
		
		while(n > 0) {
			
			int digit = n % 10;
			reverse = reverse*10 + digit;
			
			n/=10;
		}
		int difference = temp - reverse; 
		
		if(difference < 0) 
			difference = -difference;
		System.out.println("Mirror Distance Integer is: " +difference);
		sc.close();

	}

}
