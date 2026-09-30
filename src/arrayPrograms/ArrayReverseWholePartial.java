package arrayPrograms;

public class ArrayReverseWholePartial {

	public static void main(String[] args) {
		
		int [] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240};

		reverse(a, 1, 22);
		
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
