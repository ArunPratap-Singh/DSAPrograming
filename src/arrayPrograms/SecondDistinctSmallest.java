package arrayPrograms;

public class SecondDistinctSmallest {

	public static void main(String[] args) {
		
		int[] a = {80, 80, 43, 50, 38, 63, 38, 80};
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i] < smallest) {
				secondSmallest = smallest;
				smallest = a[i];
			}else if(a[i] < secondSmallest && a[i] != smallest) {
				secondSmallest = a[i];
			}
		}
		System.out.println("Smallest = " + smallest);
		System.out.println("Second Distinct Smallest is: " +secondSmallest);

	}

}
