package arithmaticOperator;

import java.util.Scanner;

public class DelayedTime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Arrival Time: ");
		double arrivalTime  = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Delayed Time: ");
		double delayedTime = Double.parseDouble(sc.nextLine());
		
		double TrainArrivalTime = arrivalTime + delayedTime;
		
		System.out.println("Train Arrived After Delay at: " +TrainArrivalTime+ " hrs");
		
		sc.close();
		
		

	}

}
