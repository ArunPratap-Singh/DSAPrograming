package arithmaticOperator;

import java.util.Scanner;

public class SwapThreeVariableWithoutVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Third Number: ");
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.println("Number Before Swapping");
		System.out.println("A is : " +a);
		System.out.println("B is : " +b);
		System.out.println("C is : " +c);
		
		a = a+b+c;
		b = a-b-c;
		c = a-b-c;
		a = a-b-c;
		
		System.out.println("Number After Swapping");
		System.out.println("A is : " +a);
		System.out.println("B is : " +b);
		System.out.println("C is : " +c);
		
		sc.close();
	}

}
