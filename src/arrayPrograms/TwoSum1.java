package arrayPrograms;

public class TwoSum1 {

	public static void main(String[] args) {
		
		int [] nums = {3,2,4,5,6,7};
		int target = 12;
		
		for(int i = 0; i < nums.length-1; i++) {
			
			for(int j = i+1; j < nums.length; j++) {
				
				if(nums[i]+nums[j] == target) {
					System.out.println("["+i+ "," +j+ "]");
				return;
				}
			}
		}
		
		//throw new run time exception

	}

}
