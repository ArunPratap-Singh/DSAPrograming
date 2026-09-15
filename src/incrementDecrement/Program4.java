package incrementDecrement;

public class Program4 {

	public static void main(String[] args) {
		
		//Solve and answer value of a, b and c.

		int a=12;
		
		int b=a++;
		
		b++;
		
		int c=a++ + --b;
		
		System.out.println(a);//14
		
		System.out.println(b);//12
		
		System.out.println(c);//25

	}

}
