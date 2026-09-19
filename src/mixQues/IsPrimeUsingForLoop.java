package mixQues;

import java.util.Scanner;

public class IsPrimeUsingForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n = Integer.parseInt(sc.nextLine());
		if(isPrime(n)) {
			System.out.println(n+ " is Prime Number");
		}else {
			System.out.println(n+ " is Not A Prime Number");
		}
		sc.close();
	}
	
	public static boolean isPrime(int n) {
		
		if(n <= 1) {
			return false;
		}
		
		for(int i = 2; i<=n/2; i++) {
			
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
