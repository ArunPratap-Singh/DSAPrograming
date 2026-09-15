package mixQues;

public class PowerOfThree {

	public static void main(String[] args) {
		
		boolean result =  isPowerOfThree(9);
		System.out.println("Result is: " +result);
	}
	
	public static boolean isPowerOfThree(int n) {
		
		if(n <= 0) {
			return false;
		}
		
		while(n > 1) {
			
			if(n % 3 != 0) {
				return false;
			}
			n/=3;
		}
		return true;
	}

}
