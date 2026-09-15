package arithmaticOperator;

public class LossPercent {

	public static void main(String[] args) {
	
		//For the given CP and SP. Calculate %Loss.
		
		int CP = 120;
		
		int SP = 90;
		
		int Loss = CP - SP;
		
		double LossPercentage = (double) Loss/CP*100;
		
		System.out.println("Cost Price is: " +CP);
		System.out.println("Selling Price is: " +SP);
		System.out.println("Loss is: " +Loss);
		System.out.println("Loss Percentage is: " +LossPercentage+ " %");


	}

}
