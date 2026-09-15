package conditionalOperator;

public class OutputOfTheProgram5 {

	public static void main(String[] args) {
		
		//What is the output of the below program?
		
				int a = 5;
				
				int b = 10;
				
				int c=(a>b) ? b++ : (a<b ? --b : b) ;
				
				System.out.println("Result is: " +c);
				
				//output = 9

	}

}
