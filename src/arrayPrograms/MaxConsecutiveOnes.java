package arrayPrograms;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		
		int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1 ,0, 1, 1, 1, 1, 1, 1, 1, 1};

		int result = findMaxConsecutiveOnes(nums);
		
		System.out.println("Maximum Consecutive ones is:  " +result);
	}
	
	public static int findMaxConsecutiveOnes(int [] nums) {
		
		int temp = 0; 
		int result = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] == 1) {
				temp++;
			}else {
				if(temp > result) {
					result = temp;
				}
				temp = 0;
			}
		}
		if(temp > result)
			result = temp;
		return result;
	}

}
