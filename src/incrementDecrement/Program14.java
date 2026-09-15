package incrementDecrement;

public class Program14 {
	
	public static void main(String[] args) {
		
		//Solve and answer:-
		int a=8;
		
		int b=12;
		
		int c= ++a +b++;
		
		c--;
		
		--b;
		
		int d= c-- + ++b + ++a;
		
		int e= a + ++b +c + d++;
		
		System.out.println (++e);//87
		System.out.println(a);//10
		System.out.println(b);//14
		System.out.println(c);//19
		System.out.println(d);//44
		System.out.println(e);//87
	}

}
