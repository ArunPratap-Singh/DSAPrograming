package arrayPrograms;

import java.util.Arrays;

public class MoveZerosProgram1 {

	public static void main(String[] args) {
		
		int [] nums = {3, 0, 5, 0, 18, 56, 12, 0, 0, 23, 0, 29};
		
		moveZeros(nums);
		
//		for(int n : nums) {
//			System.out.println("Array After reverse is: " +n+" ");
//		}
		
		System.out.println(Arrays.toString(nums));

	}
	
	public static void moveZeros(int [] nums) {
		
		int i = 0;
		
		for(int j = 0; j < nums.length; j++) {
			
			if(nums[j] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
		}
	}

}
