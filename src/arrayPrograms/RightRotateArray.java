package arrayPrograms;

public class RightRotateArray {

	public static void main(String[] args) {
		
		int [] a = {10, 20, 30, 40, 50, 60, 70};
		
		rotate(a, 3);
		
		for(int n : a) {
			System.out.println("Array After Reverse is: " +n+ " ");
		}

	}
	
	public static void rotate(int [] nums, int k) {
		
		k = k%nums.length;
		
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
	}
	
	public static void reverse(int[] a, int start, int end) {
		
		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

}
