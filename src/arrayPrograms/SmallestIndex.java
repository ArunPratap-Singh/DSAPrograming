package arrayPrograms;

public class SmallestIndex {

	//Smallest Index With Digit Sum Equal To Index
	public static void main(String[] args) {
		
		int [] a = {10, 11, 12, 13, 22, 15};
		
		for(int i = 0; i < a.length; i++) {
			
			if(digitSum (a[i]) == i) {
				System.out.println("Smallest Index is: " +i);
				return;
				
			}
		}
		System.out.println("No Such Index");

	}
	
	public static int digitSum(int n) {
		
		int sum = 0;
		while(n > 0) {
			
			int digit = n%10;
			sum = sum+digit;
			n/=10;
		}
		return sum;
	}

}
