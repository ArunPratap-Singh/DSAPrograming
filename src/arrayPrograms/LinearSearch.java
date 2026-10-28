package arrayPrograms;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] a = {34, 12, 50, 44, 28, 40, 33};
		int key = Integer.parseInt(sc.nextLine());
		
		int index = linearSearch(a, key);
		
		if(index >= 0) {
			
			System.out.println("Element is found at index: " +index);
		}else {
			System.out.println("Element int NOT Found");
		}
		
		sc.close();
	}
	
	public static int linearSearch(int [] a, int key) {
		
		for(int i = 1; i < a.length; i++) {
			
			if(a[i] == key) {
				
				return i;
			}
		}
		return -1;
	}
	

}

	