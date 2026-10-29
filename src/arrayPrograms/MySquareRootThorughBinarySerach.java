package arrayPrograms;

public class MySquareRootThorughBinarySerach {

	public static void main(String[] args) {
		
		int x = 53;
		
		int result = mySqrt(x);
		
		System.out.println("Square of " +x+ " is: " +result);

	}
	
	public static int mySqrt(int x) {
		
		
		if(x == 1) {
			
			return 1;
		}
		long start = 1;
		long end = x/2;
		
		while(start <= end) {
			
			long mid = start+(end - start)/2;
			
			if(mid*mid == x) {
				
				return (int) mid;
				
			}else if(mid*mid > x) {
				
				end = mid -1;
			}else {
				
				start = mid +1;
			}
		}
		
		return (int) end;
	}

}
