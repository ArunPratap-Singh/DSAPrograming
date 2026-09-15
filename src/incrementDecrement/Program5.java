package incrementDecrement;

public class Program5 {

	public static void main(String[] args) {
		
		//Solve and answer value of a, b and c.

		int a=10;
		
		a++;
		
		int b=++a;
		
		int c=a++ + ++b;
		
		b++;
		
		System.out.println(a);//13
		
		System.out.println(b);//14
		
		System.out.println(c);//25

	}

}
