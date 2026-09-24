package arrayPrograms;

public class SecondMax1 {

	public static void main(String[] args) {
		
		int [] a = {72, 12, 30, 10, 50, 44, 38, 29};
		
		int result = getSecondMax(a);
		
		System.out.println("SecondMax Value is: " +result);

	}
	
	public static int getSecondMax(int [] a) {
		
		int max = Integer.MIN_VALUE; int secondMax = Integer.MIN_VALUE;
		
		for(int n : a) {
			if(n > max) {
				secondMax = max;
				max = n;
			}else if (n > secondMax && n != max) {
				secondMax = n;
			}
		}
		return secondMax;
	}

}
