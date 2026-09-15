package arithmaticOperator;


public class ProfitPercent {

	public static void main(String[] args) {
		
		//For the given CP and SP. Calculate %Profit
		
		int CP=120;
		
		int SP=160;
		
		int Profit = SP - CP;
		
		double ProfitPercentage = (double)Profit/CP*100;
		
		System.out.println("Selling Price is: " +SP);
		System.out.println("Cost Price is: " +CP);
		System.out.println("Profit is: " +Profit);
		System.out.println("ProfitPercentage is: " +ProfitPercentage+ " %");
		
		
		

	}

}
