package conditionalOperator;

public class OutputOfTheProgram1 {

	public static void main(String[] args) {
	
		//What is the output of the program:
		
		int a = 3, b = 4, c = 5;
		
		int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.println("Result is: " +result);
		
		//output 5

	}

}
