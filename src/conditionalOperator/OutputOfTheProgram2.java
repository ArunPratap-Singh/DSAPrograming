package conditionalOperator;

public class OutputOfTheProgram2 {

	public static void main(String[] args) {
		
		//What is the output of the program:

			int x = 10;
			
			int y = 5;
			
			int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);
			
			System.out.println("Result is: " +z);

			//output = 10
	}

}
