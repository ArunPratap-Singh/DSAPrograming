package incrementDecrement;

public class Program12 {

	public static void main(String[] args) {
		
		//Solve and answer value of a, b and c and d.

		int a=12;
		
		int b=a++;
		
		b++;
		
		int c=a++ + --b;
		
		int d=a++ + ++b + c++;
		
		d++;
		
		c--;
		
		System.out.println(a);//15
		System.out.println(b);//13
		System.out.println(c);//25
		System.out.println(d);//53

	}

}
