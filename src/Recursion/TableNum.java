package Recursion;

public class TableNum {

	public static void main(String[] args) {
		
		System.out.println("===Main Method Starts===");
		printTable(5, 1);
		System.out.println("===Main Method Ends===");

	}
	
	public static void printTable(int num, int n) {
		
		if(n>10) {
			return;
		}
		
		System.out.println(num*n);
		printTable(num, n+1);
	}

}
