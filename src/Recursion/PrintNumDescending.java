package Recursion;

public class PrintNumDescending {

	public static void main(String[] args) {
		
		System.out.println("===Main Method Starts===");
		printNum(1);
		System.out.println("===Main Method Ends===");
		

	}
	
	public static void printNum(int n) {
		
		if(n>10) {
			return;
		}
		
		printNum(n+1);
		System.out.println(n);
	}

}
