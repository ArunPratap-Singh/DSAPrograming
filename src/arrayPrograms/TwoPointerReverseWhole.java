package arrayPrograms;

public class TwoPointerReverseWhole {

//	WAJP to reverse each element of the array.
//	Original array:[10, 20, 30, 40, 50, 60, 70];
//	Reversed array:[70, 60, 50, 40, 30, 20, 10];

	public static void main(String[] args) {
		
		int [] a = {10, 20, 30, 40, 50, 60, 70};
		
		reverse(a);
		
		for(int n : a) {
			System.out.println("Array After Reverse is: " +n+" ");
		}
	}
	
	public static void reverse(int [] a) {
		
		int start = 0;
		int end = a.length-1;	
		
		while(start < end) {
			
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}

}
