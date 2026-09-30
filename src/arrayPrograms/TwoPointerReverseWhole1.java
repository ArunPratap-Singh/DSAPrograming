package arrayPrograms;

public class TwoPointerReverseWhole1 {

//	WAJP to reverse each element of the array.
//	Original array:[10, 20, 30, 40, 50, 60, 70];
//	Reversed array:[70, 60, 50, 40, 30, 20, 10];
	public static void main(String[] args) {
		
		int [] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260};
		
		reverse(a);
		for(int n : a) {
			System.out.println("Array after reverse is: " +n+ " ");
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
