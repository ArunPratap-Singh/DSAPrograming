package mixQues;

public class AllFactorialUsingForLoop {

	public static void main(String[] args) {
		
		int n = 100;
		printAndCountAllFactorials(n);
		
	}
	
	public static void printAndCountAllFactorials(int n) {
		
		System.out.print(1 + " " +n+ " ");
		
		int count = 2;
		
		for(int i = 2; i <= n/2; i++) {
			
			if(n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("Total Factors are: " +count);
	}

}
