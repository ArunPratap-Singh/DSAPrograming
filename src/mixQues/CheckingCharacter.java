package mixQues;

import java.util.Scanner;

public class CheckingCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character: ");
		char c = sc.nextLine().charAt(0);
		
		if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >='0' && c <= '9')) {
			
			System.out.println(c+ " is AlphaNumeric Character");
		}else {
			System.out.println(c+ " is Special Character");
		}
		
		sc.close();

	}

}
