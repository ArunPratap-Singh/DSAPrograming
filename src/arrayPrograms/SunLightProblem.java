package arrayPrograms;

public class SunLightProblem {

	//Sunlight Problem:
	//In left side we have sun and array contains height of buildings. How many buildings will get sun light?

	public static void main(String[] args) {
		
		int [] a = {4, 2, 6, 8, 5, 7, 12, 6};
		
		int max = Integer.MIN_VALUE;
		int count = 1;
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i] > max) {
				count++;
				System.out.println("Building getting sunlight: " + a[i]);
				max = a[i];
			}
		}
		System.out.println("Total buildings getting sunlight: " + count);

	}

}
