package incrementDecrement;

public class Program11 {

	public static void main(String[] args) {
		
		//Solve and answer value of x, y, z and p.

		int x=12;
		
		int y=x++ + ++x;
		
		y++;
		
		int z=++y;
		
		int p=x++ - ++y + z++;
		
		System.out.println(x);//15
		System.out.println(y);//29
		System.out.println(z);//29
		System.out.println(p);//13

	}

}
