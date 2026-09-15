package conditionalOperator;

import java.util.Scanner;

public class ClosestPerson {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Person 1 Distance: ");
		int Person1Distance = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Person 2 Distance: ");
		int Person2Distance = Integer.parseInt(sc.nextLine());
		
		//Return 1 for Person 1 && Return 2 for Person 2 && Return 3 For Both Reached together
		
		System.out.println(Person1Distance<Person2Distance?1:(Person2Distance<Person1Distance?2:3));
		
		sc.close();

	}

}
