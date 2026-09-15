package incrementDecrement;

public class Program13 {

	public static void main(String[] args) {
		
		//Solve and answer value of a, b and c and d.

		int a=12;
		
		a++;
		
		++a;
		
		int b=a++;
		
		b++;
		
		int c=a++ + --b;
		
		c--;
		
		--b;
		
		int d=++a + b++ + --c;
		
		System.out.println(a);//17
		System.out.println(b);//14
		System.out.println(c);//27
		System.out.println(d);//57

	}

}
