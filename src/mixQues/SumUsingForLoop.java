package mixQues;

public class SumUsingForLoop {

	public static void main(String[] args) {
		
		int n = 5;
		int Sum = getSum(n);
		System.out.println("Sum Of Number "+n+ " is: " +Sum);

	}
	
	public static int getSum(int n) {
		
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum + i;
		}
		return sum;
	}

}
