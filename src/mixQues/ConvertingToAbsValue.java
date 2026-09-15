package mixQues;

import java.util.Scanner;

public class ConvertingToAbsValue {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num < 0) {
			num = -num;
		};
		
		System.out.println("Number is: " +num);
		
		sc.close();
	}

}
