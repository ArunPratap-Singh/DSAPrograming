package arrayPrograms;

public class ThirdMax {

	public static void main(String[] args) {
		
		long [] a = {12, 30, 10, 50, 44, 38, 29};
		
		long result = getThirdMax(a);
		
		System.out.println("Third Maximum number is: " +result);
		

	}
	
	public static long getThirdMax(long [] a) {
		
		long max = Long.MIN_VALUE; 
		long secondMax = Long.MIN_VALUE;
		long thirdMax = Long.MIN_VALUE;
		
		for(long n : a) {
			
			if(n > max) {
				
				thirdMax = secondMax;
				secondMax = max;
				max = n;
				
			}else if(n > secondMax && n != max) {
			
				thirdMax = secondMax;
				secondMax = n;
				
			}else if(n > thirdMax && n !=max && n !=secondMax) {
			
				thirdMax = n;			
			
			}
		}
		if(thirdMax == Long.MIN_VALUE) {
			return max;
		}else {
			return thirdMax;
		}
	}

}
