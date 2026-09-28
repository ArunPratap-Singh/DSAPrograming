package arrayPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class OceanViewProblemGetIndexReverse {

	//Oceanview Problem:
	//In right side we have Ocean and array contains height of buildings. Get all the index of buildings which will get Ocean view?

	public static void main(String[] args) {
		
		int [] a = {4, 2, 6, 18, 5, 7, 12, 6};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int max=  Integer.MIN_VALUE;
		
		for(int i = a.length-1; i>=0; i--) {
			
			if(a[i] > max) {
				list.add(i);
				max = a[i];
			}
		}
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
