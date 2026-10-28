package arrayPrograms;

import java.util.Scanner;

public class BinarySearchProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] a = {12, 20, 30, 34, 44, 50, 60};
		int key = Integer.parseInt(sc.nextLine());
		
		int index = binarySearch(a, key);
		
		if(index >= 0) {
			System.out.println("Element found at index: " +index);
		}else {
			System.out.println("Element id NOT Found");
		}
		
		sc.close();
	}
	
	public static int binarySearch(int [] a, int key) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start <= end) {
			
			int mid = start+(end - start)/2;
			
			if(a[mid] == key) {
				
				return mid;
			}else if(a[mid] > key) {
				
				end = mid - 1;
			}else {
				
				start = mid + 1;
			}
				
		}
		return -1;
	}
	

}
