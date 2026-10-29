package arrayPrograms;

import java.util.Scanner;

public class SearchInsert {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int [] a = {12, 20, 30, 34, 44, 50, 60};
		
		System.out.println("Enter element to search: ");
		int key = Integer.parseInt(sc.nextLine());
		
		int index = searchInsert(a, key);
		
		if(index >= 0) {
			
			System.out.println("Elemet found at index: " +index);
		}else {
			
			System.out.println("Element NOT found");
		}
		
		sc.close();
	}
	
	public static int searchInsert(int [] a, int key) {
		
		int start = 0; 
		int end = a.length-1;
		
		while(start <= end) {
			
			int mid = start+(end - start)/2;
			
			if(a[mid] == key) {
				
				return mid;
				
			}else if(a[mid] > key) {
				
				end = mid - 1;
			}else {
				
				start = mid +1;
			}
		}
		
		return start;
	}

}
