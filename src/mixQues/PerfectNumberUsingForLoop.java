package mixQues;

import java.util.Scanner;

public class PerfectNumberUsingForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		if(isPerfect(n)) {
			System.out.println(n+ " is a Perfect Number");
		}else {
			System.out.println(n+ " is not a perfect Number");
		}
		sc.close();

	}
	
	public static boolean isPerfect(int n) {
		
		if(n <= 1) {
			return false;
		}
		int sum = 0;
		
		for(int i = 1; i <= n/2; i++) {
			
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		return sum == n;
	}

}
