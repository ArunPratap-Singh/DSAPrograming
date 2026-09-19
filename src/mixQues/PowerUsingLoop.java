package mixQues;

public class PowerUsingLoop {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 3;
		int Power = getPower(a, b);
		
		System.out.println("Power of Number " +a+ " to the power " +b+ " is: " +Power);

	}
	
	public static int getPower(int a, int b) {
		
		int pow = 1;
		
		for(int i = 1; i <= b; i++) {
			
			pow=  pow * a;
		}
		return pow;
	}

}
