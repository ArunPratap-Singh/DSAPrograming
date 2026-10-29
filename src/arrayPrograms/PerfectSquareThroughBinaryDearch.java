package arrayPrograms;

public class PerfectSquareThroughBinaryDearch {
	
	public static void main(String[] args) {
		
		int x = 49;
		
		boolean result = perfectSquare(x);
		
		System.out.println("Perfect square of " +x+ " is: " +result);
	}
	
	public static boolean perfectSquare(int x) {
		
		if(x == 1) {
			 return true;
		}
		
		long start = 1;
		long end = x /2;
		
		while(start <= end) {
			
			long mid = start+(end - start)/2;
			
			if(mid*mid == x) {
				
				return true;
			}else if (mid*mid > x) {
				
				 end = mid - 1;
			}else {
				
				start = mid +1;
			}
		}
		
		return false;
	}

}
