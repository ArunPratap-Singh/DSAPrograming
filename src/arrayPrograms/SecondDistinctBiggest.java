package arrayPrograms;

public class SecondDistinctBiggest {

	public static void main(String[] args) {
		
		int[] a = {80, 80, 43, 50, 38, 63, 58, 80};
		
		int biggest = Integer.MIN_VALUE;
		int secondBiggest = Integer.MIN_VALUE;
		
		for(int i = 0; i <a.length; i++) {
			
			if(a[i] > biggest) {
				secondBiggest = biggest;
				biggest = a[i];
			}else if(a[i] > secondBiggest && a[i] != biggest){
				secondBiggest = a[i];
			}
		}
		System.out.println("Biggest is: " +biggest);
		System.out.println("Second Distinct Biggest is: " +secondBiggest);

	}

}
