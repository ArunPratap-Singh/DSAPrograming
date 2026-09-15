package conditionalOperator;

public class OutputOfTheProgram {

	public static void main(String[] args) {
		
		//What is the output of the program:
		
			int a = 5, b = 10;
			
			int c = (a > b) ? a++ : b++;
			
			System.out.println(a + " " + b + " " + c);
			
			//output = 5 11 10;

	}

}
