package arrayPrograms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int [] a = {12, 20, 15, 8, 30, 16, 5, 25};
		
		insertionSort(a);
		
		System.out.println(Arrays.toString(a));

	}
	
	public static void insertionSort(int [] a) {
		
		for(int i = 1; i<a.length; i++) {
			
			int pivot = a[i];
			int j = i-1;
			
			while(j >= 0 && a[j] > pivot) {
				
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = pivot;
		}
	}

}
