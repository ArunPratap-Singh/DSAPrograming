package mixQues;

import java.util.Scanner;

public class DelayedTime {
	
	 //Calculate Delayed Arrival Time
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Arrival Time: ");
		double arrivalTime = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Delayed Time: ");
		double delayedTime = Double.parseDouble(sc.nextLine());
		
		double TrainArrived = arrivalTime + delayedTime;
		
		System.out.println("Train Arrived After Delate at: " +TrainArrived+ " hrs");
		
		sc.close();
	}

}
