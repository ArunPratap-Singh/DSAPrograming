package loop1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String reverse = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			
			reverse = reverse + str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			System.out.println(str+" It is a Palindrome");
		}else {
			System.out.println(str+" It is Not a Palindrome");
		}
		sc.close();

	}

}
