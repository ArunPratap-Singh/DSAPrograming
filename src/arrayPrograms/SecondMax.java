package arrayPrograms;

public class SecondMax {

	public static void main(String[] args) {
		
		int [] a = {12, 30, 10, 50, 44, 38, 29};
		
		int result = getSecondMax(a);
		System.out.println("Second Max Value is: " +result);

	}
	
	public static int getSecondMax(int [] a) {
		
		int max = a[0]; int secondMax = a[0];
		
		for(int n : a) {
			 
			if(n > max) { 
				secondMax = max;
				max = n;
			}else if (n > secondMax && n != max){
				secondMax = n;
			}
		}
		return secondMax;
	}

}
