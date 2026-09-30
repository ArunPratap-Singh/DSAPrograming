package arrayPrograms;

public class SortedTwoSum {

	public static void main(String[] args) {
	
		int [] nums = {2,7,11,15};
		int target = 26;
		
		int [] result = twoSum(nums, target);
		
		System.out.println("["+result[0]+","+result[1]+"]"); 

	}
	
	public static int[] twoSum(int [] nums , int target) {
		
		int start = 0;
		int end = nums.length-1;
		
		while(start < end) {
			
			if(nums[start] +nums[end] == target) {
				return new int [] {start+1 , end+1}; 
			}else if(nums[start]+nums[end] < target) {
				start++;
			}else {
				end--;
			}
		}
		return new int [] {-1, -1};
	}

}
