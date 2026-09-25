package arrayPrograms;

public class MaxProductOfTwoInteger {

	public static void main(String[] args) {
		
		int[] nums = {3, 4, 5, 2};
		
		int result = getMaximumProduct(nums);
		System.out.println("Maximum product is: " +result);

	}
	
	public static int getMaximumProduct(int [] nums) {
		
		int max = Integer.MIN_VALUE; int secondMax = Integer.MIN_VALUE;
		
		for(int n : nums) {
			if(n > max) {
				secondMax = max;
				max = n;
			}else if(n > secondMax) {
				secondMax = n;
			}
					
		}
		return (max-1)*(secondMax-1);
	}

}
