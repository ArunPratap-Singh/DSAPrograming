package arrayPrograms;

public class BuyAndSellStock {

	public static void main(String[] args) {
		
		int [] prices = {7, 1, 5, 3, 6, 4};
		
		int buy = prices[0], maxProfit = 0;
		
		for(int n : prices) {
			if(n < buy) {
				buy = n;
			}else if(n-buy > maxProfit) {
				maxProfit = n-buy;
				
			}
				
			
		}
	System.out.println("MaxProfit is: " +maxProfit);

	}

}
