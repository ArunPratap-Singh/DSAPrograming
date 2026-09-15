package conditionalOperator;

public class OutputOfTheProgram3 {

	public static void main(String[] args) {
		
		//What is the output of the below program:
		
				int x = 10;
				
				int y = 5;
				
				int z = 7;
				
				int result = (x < y) ? (y < z ? z : y) : x;
				
				System.out.println("Result is: " +result);
				
				//output = 10

	}

}
