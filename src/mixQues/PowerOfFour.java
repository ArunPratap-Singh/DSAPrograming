package mixQues;

public class PowerOfFour {

	public static void main(String[] args) {
		
		boolean result = isPowerOfFour(65);
		System.out.println("Result is: " +result);

	}
	
	public static boolean isPowerOfFour(int n) {
		
		if(n <= 0) {
			return false;
		}
		
		while(n > 1) {
			
			if(n % 4 != 0) {
				return false;
			}
			n/=4;
		}
		return true;
	}

}
