package mixQues;

import java.util.Scanner;

public class LeapYear {
	
	//WAP to check the given year is a Leap Year or NOT.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int year = Integer.parseInt(sc.nextLine());
		
		System.out.println((year % 400 == 0 ) ? "Leap Year" : (year % 100 == 0) ? "Not A Leap Year" : (year % 4== 0) ? "Leap Year" : "Not A Leap Year");
		
		sc.close();
	}

}
