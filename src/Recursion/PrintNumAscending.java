package Recursion;

public class PrintNumAscending {

	public static void main(String[] args) {
		
		System.out.println("===Main Method Starts===");
		printNum(1);
		System.out.println("===Main Method Ends===");

	}
	
	public static void printNum(int n) {
		
		if(n>10) {
			return;
		}
		
		System.out.println(n);
		printNum(n+1);
	}

}
