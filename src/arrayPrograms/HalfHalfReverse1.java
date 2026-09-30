package arrayPrograms;

public class HalfHalfReverse1 {

	public static void main(String[] args) {
	
		int [] a = {10, 20, 30, 40, 50, 60, 70};
		
		reverse(a, 0, a.length/2-1);
		//reverse(a, a.length/2, a.length-1);
		
		for(int n : a) {
			System.out.println("Array After Reverse is: " +n+ " ");
		}

	}
	
	public static void reverse(int [] a, int start, int end) {
		
		while(start < end) {
			
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}

}
