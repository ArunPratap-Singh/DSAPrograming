package arrayPrograms;

public class OceanViewProblem {

	//Oceanview Problem:
	//In right side we have Ocean and array contains height of buildings. How many buildings will get Ocean view?

	public static void main(String[] args) {
		
		int [] a = {4, 2, 6, 18, 5, 7, 12, 6};
		
		int max = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i = a.length-1; i>=0; i--) {
			if(a[i] > max) {
				count++;
				System.out.println("Building getting OceanView: " +a[i]);
				max = a[i];
			}
		}
		System.out.println("Total Building Getting Ocean View is: " +count);


	}

}
