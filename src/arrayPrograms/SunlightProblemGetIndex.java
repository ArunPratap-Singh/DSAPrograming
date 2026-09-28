package arrayPrograms;

public class SunlightProblemGetIndex {

	//Sunlight Problem:
	//In left side we have sun and array contains height of buildings. Get index of all buildings which will get sun light?

	public static void main(String[] args) {
		
		int [] a = {4, 2, 6, 8, 5, 7, 12, 6};
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i < a.length; i++) {
			
			if(a[i] > max) {
				System.out.println(i);
				max = a[i];
			}
		}

	}

}
