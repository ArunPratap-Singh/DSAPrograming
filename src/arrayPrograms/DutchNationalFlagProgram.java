package arrayPrograms;

import java.util.Arrays;

public class DutchNationalFlagProgram {

	public static void main(String[] args) {
		
		int [] nums = {2, 0, 2, 1, 1, 0};
		sortColors(nums);
		
		System.out.println(Arrays.toString(nums));

	}
	
	public static void sortColors(int [] nums) {
		int start = 0;
		int mid = 0;
		int end = nums.length-1;
		
		while(mid <= end) {
			if(nums[mid] == 0) {
				swap(nums, start++, mid++);
			}else if(nums[mid] == 1) {
				mid++;
			}else {
				swap(nums, mid, end--);
			}
		}
		
	}
	
	public static void swap(int [] a, int i, int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
