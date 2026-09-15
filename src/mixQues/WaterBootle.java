package mixQues;

import java.util.Scanner;

public class WaterBootle {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of full bottles: ");
	        int numOfBottles = sc.nextInt();

	        System.out.print("Enter number of empty bottles required for exchange: ");
	        int numOfExchange = sc.nextInt();

	        int result = maxBottles(numOfBottles, numOfExchange);

	        System.out.println("Maximum bottles you can drink: " + result);

	        sc.close();

	}
	
	public static int maxBottles(int numOfBottles, int numOfExchange) {
		
		int total = numOfBottles;
		int empty = numOfBottles;
		
		while(empty >= numOfExchange) {
			
			int newBottles = empty/numOfExchange;
			
			total = total + newBottles;
			
			empty = (empty % numOfExchange)+ newBottles;
		}
		return total;
	}

}
