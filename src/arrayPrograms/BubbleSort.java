package arrayPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] a = {12, 20, 8, 15, 5, 25, 16};
		
		bubbleSort(a);
		
		System.out.println(Arrays.toString(a));

	}
	
	public static void bubbleSort(int [] a) { 
		
		for(int i = 0; i < a.length-1; i++) {
			
			boolean isSorted = true;
			
			for(int j = 0; j < a.length-1-i; j++) {
				
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					isSorted = false;
				}
				
			}
			if(isSorted)
				break;
		}
	}

}
