package mixQues;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		boolean Result = isPowerOfTwo(3);
		System.out.println("Result is: " +Result);

	}
	
	public static boolean isPowerOfTwo(int n) {
		
		
		if(n <= 0) 
			return false;
		while(n > 1) {
			
					
			if(n % 2 != 0) {
				
				return false;
			}
			n/=2;
		}
		return true;
		
	}
	

}
