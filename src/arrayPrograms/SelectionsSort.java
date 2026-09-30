package arrayPrograms;

import java.util.Arrays;

public class SelectionsSort {

	public static void main(String[] args) {
		
		int [] a = {12, 20, 8, 15, 5, 25, 16};
		
		selectionSort(a);
		
		System.out.println(Arrays.toString(a));

	}
	
	public static void selectionSort(int [] a) {
		
		for(int i = 0; i < a.length; i++) {
			
			int min = a[i];
			int minIndex = i;
			
			for(int j = i+1; j < a.length; j++) {
				
				if(a[j] < min) {
					min = a[j];
					minIndex = j;
				}
			}
			
			a[minIndex] = a[i];
			a[i] = min;
		}
	}

}
